package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestPalindromeNumberTest {

	@Test
	public void testLargestPalindromeNumberInRangeZero() {
		long largestPalindrome = getLargestPalindromeNumber(0);
		assertEquals(0, largestPalindrome);
	}

	@Test
	public void testLargestPalindromeNumberInRangeWIthManyPalindromes() {
		long largestPalindrome = getLargestPalindromeNumber(1007);
		assertEquals(1001, largestPalindrome);
	}

	private long getLargestPalindromeNumber(long range) {
		LargestPalindromeNumber p = new LargestPalindromeNumber();
		long largestPalindrome = p.getLargestPalindrome(range);
		return largestPalindrome;
	}
}
