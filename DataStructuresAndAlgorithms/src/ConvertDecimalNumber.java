package datastructures;

import java.util.Stack;

public class ConvertDecimalNumber {
	private static final int ERROR_CODE_NEGATIVE_NUMBER = -5;

	public int convert(int number) {

		if (!isPositiveNumber(number)) {
			return ERROR_CODE_NEGATIVE_NUMBER;
		}

		Stack<Integer> binaryNumber = new Stack<>();
		int result;
		while (number > 0) {
			result = number % 2;
			binaryNumber.push(result);
			number /= 2;
		}
		int convertedNumber = makeNumber(binaryNumber);
		return convertedNumber;
	}

	private int makeNumber(Stack<Integer> binaryNumber) {
		int currentElement;
		int number = 0;

		while (!binaryNumber.isEmpty()) {
			currentElement = binaryNumber.peek();
			number *= 10;
			number += currentElement;
			binaryNumber.pop();
		}
		return number;
	}

	private boolean isPositiveNumber(int number) {
		if (number < 0) {
			return false;
		}
		return true;
	}

	public static void main(String args[]) {
	}
}
