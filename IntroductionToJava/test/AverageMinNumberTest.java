package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class AverageMinNumberTest {

	private static final int[] PRIME_SIZE_ARRAY = { 1, 5, 4, 3, 9, 0 };
	private static final int[] EVEN_SIZE_ARRAY = { 1, 5, 4, 3, 0 };

	@Test
	public void testAverageMinNumberInArratWIthePrimeSize() {
		assertEquals(4, getAverageNumber(PRIME_SIZE_ARRAY));
	}

	@Test
	public void testAverageMinNumberInArratWIthEvenSize() {
		assertEquals(3, getAverageNumber(EVEN_SIZE_ARRAY));
	}

	private int getAverageNumber(int[] numbers) {
		AverageMinNumber a = new AverageMinNumber();
		int averageNumber = a.getAverage(numbers);
		return averageNumber;
	}

}
