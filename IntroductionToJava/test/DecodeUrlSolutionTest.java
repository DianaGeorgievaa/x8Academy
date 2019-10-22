package firstweek;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecodeUrlSolutionTest {
	private static final String URL_WITHOUT_SPECIAL_SIGNS = "abcde1!";
	private static final String URL_WITH_SPECIAL_SIGNS = "%2F%2F%3D";

	@Test
	public void testDecodeURLWithoutSpecialSigns() {
		assertEquals(URL_WITHOUT_SPECIAL_SIGNS, decode(URL_WITHOUT_SPECIAL_SIGNS));
	}

	@Test
	public void testDecodeURLWithSpecialSigns() {
		assertEquals("//?", decode(URL_WITH_SPECIAL_SIGNS));
	}

	private String decode(String url) {
		DecodeUrlSolution d = new DecodeUrlSolution();
		String result = d.decodeUrl(url);
		return result;
	}

}
