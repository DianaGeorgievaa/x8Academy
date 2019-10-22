package firstweek;

public class CopyCharacter {

	public String copyChars(String input, int k) {
		StringBuilder result = new StringBuilder(input);
		if (k == 0) {
			return new String(result);
		}
		for (int i = 1; i < k; i++) {
			result.append(input);
		}
		return new String(result);
	}

	public static void main(String[] args) {
		CopyCharacter c = new CopyCharacter();
		System.out.println(c.copyChars("abc?", 0));
		System.out.println(c.copyChars("abc?", -4));
		System.out.println(c.copyChars("abc?", 3));
	}

}
