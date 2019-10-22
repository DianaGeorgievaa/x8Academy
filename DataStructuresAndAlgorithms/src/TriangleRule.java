package datastructures;

import java.util.Arrays;

public class TriangleRule {

	public boolean isPossibleTriangle(int[] numbers) {

		if (numbers.length < 3 || this.checkForNegativeNumbers(numbers)) {
			return false;
		}

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length - 2; i++) {
			if (numbers[i] + numbers[i + 1] > numbers[i + 2])
				return true;
		}
		return false;
	}

	private boolean checkForNegativeNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= 0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
	}

}
