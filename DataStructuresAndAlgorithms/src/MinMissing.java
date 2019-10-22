package datastructures;

import java.util.Set;

import java.util.HashSet;

public class MinMissing {

	public int findMinMissing(int[] numbers) {
		Set<Integer> elements = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			elements.add(numbers[i]);
		}

		int maxElement = numbers.length;
		for (int i = 1; i <= maxElement; i++) {
			if (!elements.contains(i)) {
				return i;
			}
		}
		return maxElement + 1;
	}

	public static void main(String[] args) {
	}
}