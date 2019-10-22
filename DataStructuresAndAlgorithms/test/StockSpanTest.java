package datastructures;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class StockSpanTest {
	
	private static int[] PRICES = { 10, 4, 5, 90, 120, 80 };

	private StockSpan s;

	@Before
	public void setUp() {
		this.s = new StockSpan();
	}

	@Test
	public void testStockSpan() {
		int[] result = s.calculateSpan(PRICES);
		int[] expectedResult = { 1, 1, 2, 4, 5, 1 };
		Arrays.equals(expectedResult, result);
	}

}
