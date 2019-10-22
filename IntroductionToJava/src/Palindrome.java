package firstweek;

public class Palindrome {

	public boolean isPalindrome(String argument) {
		int sizeOfArgument = argument.length();
		int middleIndex = sizeOfArgument / 2;
		boolean isPal = true;

		for (int i = 0; i < middleIndex; i++) {
			if (argument.charAt(i) != argument.charAt(sizeOfArgument - 1 - i)) {
				isPal = false;
			}
		}
		return isPal;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome("acaa"));
		System.out.println(p.isPalindrome("aaa"));
		System.out.println(p.isPalindrome(""));
	}

}
