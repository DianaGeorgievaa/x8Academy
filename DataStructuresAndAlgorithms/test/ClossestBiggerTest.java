package datastructures;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class ClossestBiggerTest {

	private static final int[] SORTED_NUMBERS = { 9, 8, 7, 6, 5 };

	private static final int[] UNSORTED_NUMBERS = { 11, 13, 21, 3 };

	private ClossestBigger c;

	@Before
	public void setUp() {
		this.c = new ClossestBigger();
	}

	@Test
	public void testGetClossestBiggerInSortedArray() {
		int[] result = c.getClossestBigger(SORTED_NUMBERS);
		int[] expectedResult = { -1, -1, -1, -1, -1 };
		Arrays.equals(expectedResult, result);
	}

	@Test
	public void testGetClossestBiggerInUnsortedArray() {
		int[] result = c.getClossestBigger(UNSORTED_NUMBERS);
		int[] expectedResult = { 13, 21, -1, -1 };
		Arrays.equals(expectedResult, result);
	}
}
