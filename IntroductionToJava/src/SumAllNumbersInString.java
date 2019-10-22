package firstweek;

public class SumAllNumbersInString {
	public int sumNumbers(String input) {
		int sumOfNumbers = 0;
		int sizeOfInput = input.length();

		for (int i = 0; i < sizeOfInput; i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				int currentNumber = Integer.valueOf(input.charAt(i)) - '0';
				sumOfNumbers += currentNumber;
			}
		}
		return sumOfNumbers;
	}

	public static void main(String[] args) {
		SumAllNumbersInString s = new SumAllNumbersInString();
		System.out.println(s.sumNumbers("123kk+"));
	}

}
