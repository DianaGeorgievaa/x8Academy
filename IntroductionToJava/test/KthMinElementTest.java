package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class KthMinElementTest {
	private static final int[] NUMBERS = { 1, 2, 3, 4, 5, 6, 9 };

	@Test
	public void testMinElementInEmptyArray() {
		int arr[] = {};
		int result = getMinElement(arr, 8);
		assertEquals(0, result);

	}

	@Test
	public void testMinElementInArray() {
		int result = getMinElement(NUMBERS, 5);
		assertEquals(6, result);

	}

	@Test
	public void testMinElementWithKGreaterThanSize() {
		int result = getMinElement(NUMBERS, 19);
		assertEquals(0, result);

	}

	private int getMinElement(int numbers[], int n) {
		KthMinElement k = new KthMinElement();
		int minElement = k.kthMin(n, numbers);
		return minElement;
	}

}
