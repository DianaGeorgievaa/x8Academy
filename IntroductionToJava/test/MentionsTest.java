package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class MentionsTest {
	private static final String TEXT = "abc abv abc abd";
	private static final String EMPTY_TEXT = "";
	private static final String WORD = "abc";

	@Test
	public void testMentionsInText() {
		int result = getNumberOfMentions(WORD, TEXT);
		assertEquals(2, result);
	}

	@Test
	public void testMentionsInEmptyString() {
		int result = getNumberOfMentions(WORD, EMPTY_TEXT);
		assertEquals(0, result);
	}

	private int getNumberOfMentions(String word, String text) {
		Mentions m = new Mentions();
		int counter = m.countMentions(word, text);
		return counter;
	}

}
