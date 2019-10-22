package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class CopyCharacterTest {
	private static final String INPUT_STRING = "abcd!";
	private static final String INPUT_RESULT = "abcd!abcd!abcd!abcd!";

	@Test
	public void testCopyStringPositiveTimes() {
		assertEquals(INPUT_RESULT, getString(INPUT_STRING, 4));
	}

	@Test
	public void testCopyStringZeroTimes() {
		assertEquals(INPUT_STRING, getString(INPUT_STRING, 0));
	}

	private String getString(String charakters, int k) {
		CopyCharacter c = new CopyCharacter();
		StringBuilder result = new StringBuilder(c.copyChars(charakters, k));
		return new String(result);
	}

}
