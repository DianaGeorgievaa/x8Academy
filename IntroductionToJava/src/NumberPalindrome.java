package firstweek;

public class NumberPalindrome {

	public boolean isPalindrome(int argument) {
		int reversedNumber = 0;
		int remainder;
		int originalNumber = argument;

		while (argument != 0) {
			remainder = argument % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			argument /= 10;
		}

		if (reversedNumber == originalNumber) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		NumberPalindrome n = new NumberPalindrome();
		System.out.println(n.isPalindrome(121));
		System.out.println(n.isPalindrome(51));
	}
}
