package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinMissingTest {

	private MinMissing m;

	@Before
	public void setUp() {
		this.m = new MinMissing();
	}

	@Test
	public void testMinMissingInArrayWithNoMissingNumber() {
		int[] numbers = { 1, 6, 4, 2, 5, 3 };
		assertEquals(7, m.findMinMissing(numbers));
	}

	@Test
	public void testFirstMinMissingNumber() {
		int[] numbers = { 2, 6, 4, 2, 5, 3 };
		assertEquals(1, m.findMinMissing(numbers));
	}

	@Test
	public void testMinMissingNumberInArrayWithAllEqualNumbers() {
		int[] numbers = { 3, 3, 3, 3, 3, 3 };
		assertEquals(1, m.findMinMissing(numbers));
	}
}
