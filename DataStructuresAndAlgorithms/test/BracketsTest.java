package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BracketsTest {

	private static final String CORRECT_BRACKETS = "(kk()<>[])";

	private static final String INCORRECT_BRACKETS_ORDER = ")(kk()<>[]";

	private static final String INCORRECT_BRACKETS = "())kk()<>[]]";

	private Brackets b;

	@Before
	public void setUp() {
		this.b = new Brackets();
	}

	@Test
	public void testStringWithCorrectBrackets() {
		boolean areCorrect = this.b.areCorrectBrackets(CORRECT_BRACKETS);
		assertTrue(areCorrect);
	}

	@Test
	public void testStringWithIncorrectBracketsOrder() {
		boolean areCorrect = this.b.areCorrectBrackets(INCORRECT_BRACKETS_ORDER);
		assertFalse(areCorrect);
	}

	@Test
	public void testStringWithIncorrectBrackets() {
		boolean areCorrect = this.b.areCorrectBrackets(INCORRECT_BRACKETS);
		assertFalse(areCorrect);
	}
}
