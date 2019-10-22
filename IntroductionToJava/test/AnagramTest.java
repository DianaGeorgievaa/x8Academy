package firstweek;

import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest {

	private static final String LONG_STRING = "aaaa‡‡‡‡";
	private static final String SHORT_STRING = "aa";
	private static final String FIRST_ANAGRAM_STRING = "abcds";
	private static final String SECOND_ANAGRAM_STRING = "sdcba";
	private static final String NOT_ANAGRAM_STRING = "scdsb";

	@Test
	public void testStringsWithDifferentLength() {
		assertEquals(false, checkAnagram(LONG_STRING, SHORT_STRING));
	}

	@Test
	public void testNotAnagramStringWithEqualLength() {
		assertEquals(false, checkAnagram(FIRST_ANAGRAM_STRING, NOT_ANAGRAM_STRING));
	}

	@Test
	public void tesAnagramStringWithEqualLength() {
		assertEquals(true, checkAnagram(FIRST_ANAGRAM_STRING, SECOND_ANAGRAM_STRING));
	}

	private boolean checkAnagram(String firstString, String secondString) {
		Anagram a = new Anagram();
		boolean result = a.anagram(firstString, secondString);
		return result;
	}

}
