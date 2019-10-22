package firstweek;

public class ReverseEveryWord {

	public String reverseEveryWord(String arg) {
		String words[] = arg.split("\\s");
		String reversedWord = "";

		for (String str : words) {
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			reversedWord += sb.toString() + " ";
		}
		return reversedWord.trim();
	}

	public static void main(String[] args) {
		ReverseEveryWord r = new ReverseEveryWord();
		System.out.println(r.reverseEveryWord("iamDiana"));

	}

}
