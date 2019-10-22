package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestMultipleTest {

	@Test
	public void testSmallestMultipleWithOddRange() {
		long result = getSmallestMultiple(6);
		assertEquals(60, result);
	}

	@Test
	public void testSmallestMultipleWithEvenRange() {
		long result = getSmallestMultiple(5);
		assertEquals(60, result);
	}

	private long getSmallestMultiple(int range) {
		SmallestMultiple s = new SmallestMultiple();
		long result = s.getSmallestMultiple(range);
		return result;
	}

}
