package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	@Test
	public void testPowerWithZero() {
		long result = getPower(7, 0);
		assertEquals(1, result);
	}

	@Test
	public void testPowerWithOne() {
		long result = getPower(7, 1);
		assertEquals(7, result);
	}

	@Test
	public void testPowerWithEvenNumber() {
		long result = getPower(2, 3);
		assertEquals(8, result);
	}

	private long getPower(int a, int b) {
		Power p = new Power();
		long result = p.pow(a, b);
		return result;
	}

}
