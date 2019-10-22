package firstweek;

import java.util.HashMap;
import java.util.Map;

public class HasAnagramSolution {
	public boolean checkLength(String firstString, String secondString) {
		if (firstString.length() != secondString.length()) {
			return false;
		}
		return true;
	}

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

	public boolean hasAnagram(String a, String b) {
		int sizeOfB = b.length();
		int sizeOfA = a.length();

		if (sizeOfB > sizeOfA) {
			return false;
		}

		for (int i = 0; i < sizeOfA; i++) {
			String str = a.substring(i, i + sizeOfB);
			if (anagram(str, b)) {
				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		HasAnagramSolution h = new HasAnagramSolution();
		System.out.println(h.hasAnagram("a", "abcii"));
		System.out.println(h.hasAnagram("l", "abc"));
		System.out.println(h.hasAnagram("cba", "abc"));
		System.out.println(h.hasAnagram("fmiakedocjaja", "code"));
	}

}
