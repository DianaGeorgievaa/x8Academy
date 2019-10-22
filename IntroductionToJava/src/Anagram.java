package firstweek;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public boolean anagram(String firstString, String secondString) {
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();

		boolean isLengthEqual = checkLength(firstString, secondString);

		if (!isLengthEqual) {
			return false;
		}

		Map<Character, Integer> charakters = new HashMap<>();
		int secondStringLength = secondString.length();

		for (int i = 0; i < secondStringLength; i++) {
			char currentCharakter = secondString.charAt(i);

			if (!charakters.containsKey(currentCharakter)) {
				charakters.put(currentCharakter, 1);
			} else {
				int currentCharakterFrequency = charakters.get(currentCharakter);
				currentCharakterFrequency++;
				charakters.put(currentCharakter, currentCharakterFrequency);
			}
		}

		int firstStringLength = firstString.length();
		for (int i = 0; i < firstStringLength; i++) {
			char currentCharakter = firstString.charAt(i);

			if (!charakters.containsKey(currentCharakter)) {
				return false;
			}

			int frequency = charakters.get(currentCharakter);
			if (frequency == 0) {
				return false;
			} else
				frequency--;
			charakters.put(currentCharakter, frequency);
		}
		return true;

	}

	private boolean checkLength(String firstString, String secondString) {
		if (firstString.length() != secondString.length()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.anagram("abc", "cbaa"));
		System.out.println(a.anagram("abc", "cba"));
	}

}
