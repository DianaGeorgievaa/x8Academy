package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumAllNumbersInStringTest {
	private static final String STRING_WITHOUT_NUMBERS = "abvg!@";
	private static final String STRING_WITH_NUMBERS = "0a1bv5g9!@";
	private static final String EMPTY_STRING = "";

	@Test
	public void testStringWithoutNumbers() {
		int result = getSum(STRING_WITHOUT_NUMBERS);
		assertEquals(0, result);

	}

	@Test
	public void testStringWitNumbers() {
		int result = getSum(STRING_WITH_NUMBERS);
		assertEquals(15, result);

	}

	@Test
	public void testEmptyString() {
		int result = getSum(EMPTY_STRING);
		assertEquals(0, result);

	}

	private int getSum(String input) {
		SumAllNumbersInString s = new SumAllNumbersInString();
		int sum = s.sumNumbers(input);
		return sum;
	}

}
