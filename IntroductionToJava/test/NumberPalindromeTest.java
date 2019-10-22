package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberPalindromeTest {
	private static final int PALINDROME_NUMBER = 1111;
	private static final int NOT_PALINDROME_NUMBER = 123;

	@Test
	public void testPalindromNumberForPalindrome() {
		boolean isPalindrome = checkIsNumberPalindrome(PALINDROME_NUMBER);
		assertTrue(isPalindrome);
	}

	@Test
	public void testNotPalindromNumberForPalindrome() {
		boolean isPalindrome = checkIsNumberPalindrome(NOT_PALINDROME_NUMBER);
		assertFalse(isPalindrome);
	}

	private boolean checkIsNumberPalindrome(int number) {
		NumberPalindrome n = new NumberPalindrome();
		boolean isPalindrome = n.isPalindrome(number);
		return isPalindrome;
	}

}
