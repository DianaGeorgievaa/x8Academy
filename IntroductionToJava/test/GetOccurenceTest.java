package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetOccurenceTest {
	public static final int[] ARRAY_WITH_EQUAL_NUMBERS = { 1, 1, 1 };
	public static final int[] ARRAY_WITH_DIFEFRENT_NUMBERS = { 1, 2, 3, 4 };

	@Test
	public void testArrayWithDifferentNumbersShouldReturnFirstNumber() {
		int result = getOcurrence(ARRAY_WITH_DIFEFRENT_NUMBERS);
		assertEquals(1, result);

	}

	@Test
	public void testArray() {
		int result = getOcurrence(ARRAY_WITH_EQUAL_NUMBERS);
		assertEquals(1, result);

	}

	private int getOcurrence(int[] numbers) {
		GetOccurence g = new GetOccurence();
		int number = g.getOccurence(numbers);
		return number;
	}

}
