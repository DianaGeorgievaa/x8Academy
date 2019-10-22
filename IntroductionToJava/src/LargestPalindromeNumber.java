package firstweek;

public class LargestPalindromeNumber {

	public boolean checkNumbers(long firstNumber, long secondNumber) {
		if (firstNumber == secondNumber) {
			return true;
		}
		return false;
	}

	public boolean isPalindrome(long argument) {
		long reversedNumber = 0;
		long remainder;
		long originalNumber = argument;

		while (argument != 0) {
			remainder = argument % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			argument /= 10;
		}
		boolean areEqual = checkNumbers(originalNumber, reversedNumber);
		if (areEqual) {
			return true;
		}
		return false;
	}

	public long getLargestPalindrome(long N) {
		long largestNumber = 0;

		for (long i = 0; i < N; i++) {
			if (isPalindrome(i) && i > largestNumber) {
				largestNumber = i;
			}
		}
		return largestNumber;
	}

	public static void main(String[] args) {
		LargestPalindromeNumber l = new LargestPalindromeNumber();
		System.out.println(l.getLargestPalindrome(1007));
		System.out.println(l.getLargestPalindrome(0));
	}

}
