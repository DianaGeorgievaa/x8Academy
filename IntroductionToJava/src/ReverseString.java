package firstweek;

public class ReverseString {
	public String reverse(String input) {

		StringBuilder result = new StringBuilder(input);
		result.reverse();
		return new String(result);
	}

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		System.out.println(r.reverse("abcaa"));
		System.out.println(r.reverse(""));
	}
}
