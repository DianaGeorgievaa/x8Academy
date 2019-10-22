package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinMissingInSortedArrayTest {

	private MinMissingInSortedArray m;

	@Before
	public void setUp() {
		this.m = new MinMissingInSortedArray();
	}

	@Test
	public void testArrayWithoutMissingNumber() {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		assertEquals(7, m.findMinMissing(numbers));
	}

	@Test
	public void testArrayWithMissingNumber() {
		int[] numbers = { 1, 2, 3, 5, 6 };
		assertEquals(4, m.findMinMissing(numbers));
	}
}
