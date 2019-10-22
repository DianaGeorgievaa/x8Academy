package firstweek;

public class DecodeUrlSolution {
	public static final int DECODE_LENGTH = 3;

	public String decodeUrl(String input) {
		int inputLength = input.length();
		int index = 0;
		String decodeResult = "";

		while (index < inputLength) {
			String substring = "";
			if (index + DECODE_LENGTH > inputLength) {
				substring = input.substring(index, index + 1);
			} else {
				substring = input.substring(index, index + DECODE_LENGTH);
			}
			if (substring.equals("%20")) {
				decodeResult += " ";
				index += DECODE_LENGTH;
			} else if (substring.equals("%3A")) {
				decodeResult += ":";
				index += DECODE_LENGTH;
			} else if (substring.equals("%3D")) {
				decodeResult += "?";
				index += DECODE_LENGTH;
			} else if (substring.equals("%2F")) {
				decodeResult += "/";
				index += DECODE_LENGTH;
			} else {
				decodeResult += input.charAt(index);
				index++;
			}
		}

		return decodeResult;
	}

	public static void main(String[] args) {
		DecodeUrlSolution d = new DecodeUrlSolution();
		String text = "%2F%2F%3D";
		System.out.println(d.decodeUrl(text));
	}

}
