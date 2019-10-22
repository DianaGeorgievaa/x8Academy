package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertDecimalNumberTest {

	@Test
	public void testConvertNegativeDecimalNumberToBinary() {
		int convertedNumer = getConvertedNumber(-10);
		assertEquals(-5, convertedNumer);
	}

	@Test
	public void testConvertPositiveDecimalNumberToBinary() {
		int convertedNumber = getConvertedNumber(15);
		assertEquals(1111, convertedNumber);
	}

	@Test
	public void testConvertOneToBinary() {
		int convertedNumber = getConvertedNumber(1);
		assertEquals(1, convertedNumber);
	}

	@Test
	public void testConvertZeroToBinary() {
		int convertedNumber = getConvertedNumber(0);
		assertEquals(0, convertedNumber);
	}

	private int getConvertedNumber(int number) {
		ConvertDecimalNumber c = new ConvertDecimalNumber();
		int convertedNumber = c.convert(number);
		return convertedNumber;
	}
}
