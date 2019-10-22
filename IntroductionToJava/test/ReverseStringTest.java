package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
	private static final String INPUT_STRING = "abcdef123";
	private static final String REVERSED_INPUT_STRING = "321fedcba";
	private static final String EMPTY_STRING = "";

	@Test
	public void testReverseValidInput() {
		String result = getReversedString(INPUT_STRING);
		assertEquals(REVERSED_INPUT_STRING, result);
	}

	@Test
	public void testReverseEmptyString() {
		String result = getReversedString(EMPTY_STRING);
		assertEquals(EMPTY_STRING, result);
	}

	private String getReversedString(String input) {
		ReverseString r = new ReverseString();
		String result = r.reverse(input);
		return result;
	}

}
