package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualSumSidesSolutionTest {

	private static final int[] EQUAL_SUM_SIDE_ARRAY = { 3, 0, -1, 2, 1 };
	private static final int[] NOT_EQUAL_SUM_SIDE_ARRAY = { 1, 1 };

	@Test
	public void testEqualSumSides() {
		assertEquals(true, areEqualSides(EQUAL_SUM_SIDE_ARRAY));
	}

	@Test
	public void testNotEqualSumSides() {
		assertEquals(false, areEqualSides(NOT_EQUAL_SUM_SIDE_ARRAY));
	}

	private boolean areEqualSides(int[] numbers) {
		EqualSumSidesSolution e = new EqualSumSidesSolution();
		return e.equalSumSides(numbers);
	}
}
