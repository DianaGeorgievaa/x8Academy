package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinElementTest {
	private static final int ERROR_CODE = -1000;
	private static final int[] EMPTY_ARRAY = {};
	private static final int[] NUMBERS = { 9, 8, -8, 0, -10, 3 };

	@Test
	public void testMinNumberInEmptyAray() {
		int minNumber = getMinNumber(EMPTY_ARRAY);
		assertEquals(ERROR_CODE, minNumber);
	}

	@Test
	public void testMinNumber() {
		int minNumber = getMinNumber(NUMBERS);
		assertEquals(-10, minNumber);
	}

	private int getMinNumber(int[] numbers) {
		MinElement m = new MinElement();
		int minElement = m.getMinElement(numbers);
		return minElement;
	}

}
