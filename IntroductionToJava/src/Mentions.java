package firstweek;

public class Mentions {

	public int countMentions(String word, String text) {
		int countOcuurances = 0;

		while (text.contains(word)) {
			countOcuurances++;
			int startIndex = text.indexOf(word);
			int wordLength = word.length();
			text = text.substring(startIndex + wordLength);
		}

		return countOcuurances;
	}

	public static void main(String[] args) {
		Mentions m = new Mentions();
		String word = "what";
		String text = "whattfwahtfwhatawhathwatwhat";

		System.out.println(m.countMentions(word, text));

	}

}
