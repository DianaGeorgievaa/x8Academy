package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddNumberTest {
	private static final int ODD_NUMBER = 9;
	private static final int EVEN_NUMBER = 8;

	@Test
	public void testEvenNumber() {
		boolean isOdd = checkIsOdd(EVEN_NUMBER);
		assertFalse(isOdd);
	}

	@Test
	public void testOddNumber() {
		boolean isOdd = checkIsOdd(ODD_NUMBER);
		assertTrue(isOdd);
	}

	@Test
	public void testZeroForOddNumber() {
		boolean isOdd = checkIsOdd(0);
		assertFalse(isOdd);
	}

	private boolean checkIsOdd(int number) {
		OddNumber o = new OddNumber();
		boolean isOddNumber = o.isOdd(number);
		return isOddNumber;
	}
}
