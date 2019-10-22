package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {
	private static final int NEGATIVE_NUMBER = -9;
	private static final int POSITIVE_PRIME_NUMBER = 9;
	private static final int POSITIVE_NOT_PRIME_NUMBER = 3;

	@Test
	public void testNegativeNumberForPrime() {
		boolean result = checkIsPrime(NEGATIVE_NUMBER);
		assertFalse(result);

	}

	@Test
	public void testPositiveNotPrimeNumberForPrime() {
		boolean result = checkIsPrime(POSITIVE_NOT_PRIME_NUMBER);
		assertFalse(result);

	}

	@Test
	public void testPositivePrimeNumberForPrime() {
		boolean result = checkIsPrime(POSITIVE_PRIME_NUMBER);
		assertTrue(result);

	}

	private boolean checkIsPrime(int number) {
		PrimeNumber p = new PrimeNumber();
		boolean isPrimeNumber = p.isPrime(number);
		return isPrimeNumber;
	}

}
