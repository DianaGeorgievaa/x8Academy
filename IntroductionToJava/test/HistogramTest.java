package firstweek;

import java.util.Arrays;

import org.junit.Test;

public class HistogramTest {
	private static final int[][] EMPTY_IMAGE = {};
	private static final int[][] IMAGE = { { 2, 2, 3, 4 }, { 1, 8, 9, 3 } };

	@Test
	public void testHistogramWithEmptyArray() {
		Histogram h = new Histogram();
		int[] result = h.histogram(EMPTY_IMAGE);
		int[] expected = new int[256];
		Arrays.equals(expected, result);
	}

	@Test
	public void testHistogramWithImage() {
		Histogram h = new Histogram();
		int[] result = h.histogram(IMAGE);
		int[] expected = new int[256];
		expected[2] = 2;
		expected[3] = 2;
		expected[4] = 1;
		expected[8] = 1;
		expected[9] = 1;
		Arrays.equals(expected, result);
	}

}
