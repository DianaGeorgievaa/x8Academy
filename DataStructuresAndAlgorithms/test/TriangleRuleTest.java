package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleRuleTest {

	private TriangleRule t;

	@Before
	public void setUp() {
		this.t = new TriangleRule();
	}

	@Test
	public void testArrayWithLessThanThreeElements() {
		int[] numbers = { 1, 3 };
		assertFalse(t.isPossibleTriangle(numbers));
	}

	@Test
	public void testArrayWithTriangleNumbers() {
		int[] numbers = { 5, 2, 3, 1, 4 };
		assertTrue(t.isPossibleTriangle(numbers));
	}

	@Test
	public void testArrayWithoutTriangleNumbers() {
		int[] numbers = { 1, 3, 0 };
		assertFalse(t.isPossibleTriangle(numbers));
	}
}
