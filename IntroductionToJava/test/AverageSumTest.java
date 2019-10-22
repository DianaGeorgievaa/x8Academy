package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class AverageSumTest {

	private static final int[] POSITIVE_NUMBERS = { 5, 4, 3, 8, 0 };
	private static final int[] NEGATIVE_NUMBERS = { -5, -4, -3, -8, 0 };

	@Test
	public void testAverageSumOfPositiveNumbers() {
		assertEquals(4.0, getAverageSum(POSITIVE_NUMBERS), 0);
	}

	@Test
	public void testAverageSumOfNegativeNumbers() {
		assertEquals(-4.0, getAverageSum(NEGATIVE_NUMBERS), 0);
	}

	private double getAverageSum(int[] numbers) {
		AverageSum a = new AverageSum();
		double averageSum = a.getAverageSum(numbers);
		return averageSum;
	}
}
