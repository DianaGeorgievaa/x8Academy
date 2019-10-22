package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	public static final int INVALID_VALUE = -10;

	@Test
	public void testFactorialWithZero() {
		long result = getFactorial(0);
		assertEquals(1, result);
	}

	@Test
	public void testFactorialWithPositiveNumber() {
		long result = getFactorial(6);
		assertEquals(48, result);
	}

	@Test
	public void testFactorialWithNegaiveNumberShouldReturnInvalidValue() {
		long result = getFactorial(-6);
		assertEquals(INVALID_VALUE, result);
	}

	private long getFactorial(int number) {
		Factorial f = new Factorial();
		long result = f.doubleFactorial(number);
		return result;

	}

}
