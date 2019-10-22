package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class HasAnagramSolutionTest {

	@Test
	public void testNotAnagramStrings() {
		boolean hasAnagram = hasSubstringAnagram("lk", "abc");
		assertFalse(hasAnagram);
	}

	@Test
	public void testAnagramStrings() {
		boolean hasAnagram = hasSubstringAnagram("abcdef", "abc");
		assertTrue(hasAnagram);
	}

	@Test
	public void testStringsWithDifferentSize() {
		boolean hasAnagram = hasSubstringAnagram("abf", "abckoiyfstt");
		assertFalse(hasAnagram);
	}

	private boolean hasSubstringAnagram(String firstString, String secondString) {
		HasAnagramSolution h = new HasAnagramSolution();
		boolean flag = h.hasAnagram(firstString, secondString);
		return flag;
	}

}
