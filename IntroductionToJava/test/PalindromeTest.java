package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	private static final String NOT_PALINDROME_STRING = "abcde";
	private static final String PALINDROME_STRING = "abccba";
	private static final String EMPTY_STRING = "";

	@Test
	public void testNotPalindromeStringForPalindrome() {
		boolean isPalindrome = checkIsPalindrome(NOT_PALINDROME_STRING);
		assertFalse(isPalindrome);
	}

	@Test
	public void testPalindromeStringForPalindrome() {
		boolean isPalindrome = checkIsPalindrome(PALINDROME_STRING);
		assertTrue(isPalindrome);
	}

	@Test
	public void testEmptyStringForPalindrome() {
		boolean isPalindrome = checkIsPalindrome(EMPTY_STRING);
		assertTrue(isPalindrome);
	}

	private boolean checkIsPalindrome(String input) {
		Palindrome p = new Palindrome();
		boolean isPal = p.isPalindrome(input);
		return isPal;
	}

}
