package datastructures;

public class MinMissingInSortedArray {

	public int findMinMissing(int[] numbers) {
		int left = 0;
		int right = numbers.length - 1;
		int middle;

		while (left <= right) {
			middle = (left + right) / 2;
			if (numbers[middle] != middle + 1 && numbers[middle - 1] == middle) {
				return middle + 1;
			}
			if (numbers[middle] != middle + 1) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}

		int maxElement = numbers[numbers.length - 1];
		return maxElement + 1;
	}

	public static void main(String[] args) {
	}

}
