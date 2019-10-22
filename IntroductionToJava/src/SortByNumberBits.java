package firstweek;

import java.util.*;
import java.util.stream.*;

public class SortByNumberBits {

	public static void printSortedNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
	}


	private static int getNumberOfSetBits(int number) {
		int countBits = 0;
		while (number > 0) {
			if (number % 2 != 0) {
				countBits++;
			}
			number /= 2;
		}
		return countBits;
	}

	public void sortBySetBitsCount(int numbers[]) {
		int size = numbers.length;
		int bitsArray[] = new int[size];
		for (int i = 0; i < size; i++) {
			bitsArray[i] = getNumberOfSetBits(numbers[i]);
		}
		 insertionSort(numbers, bitsArray);
	}

	public void insertionSort(int numbers[], int bitsArray[]) {
		int size = numbers.length;
		int currentNumber;
		int currentBits;
		for (int i = 1; i < size; i++) {
			currentBits = bitsArray[i];
			currentNumber = numbers[i];
			int j = i - 1;

			while (j >= 0 && bitsArray[j] < currentBits) {
				bitsArray[j + 1] = bitsArray[j];
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			bitsArray[j + 1] = currentBits;
			numbers[j + 1] = currentNumber;
		}
	}
	public static void main(String args[]) {
		
	}
}
