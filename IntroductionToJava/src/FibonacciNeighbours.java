package firstweek;

import java.util.*;

public class FibonacciNeighbours {

	private static boolean isFibonacciNumber(int number) {
		if (number == 0) {
			return true;
		}

		int fibonacciSum = 1;
		int start = 0;
		int tempSum = 0;

		while (fibonacciSum < number) {
			tempSum = fibonacciSum;
			fibonacciSum += start;
			start = tempSum;
		}
		if (fibonacciSum == number) {
			return true;
		}
		return false;
	}

	private static Vector<Integer> getNeighbours(int[][] matrix, int rowIndex, int columnIndex) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		Vector<Integer> neighbours = new Vector();

		if (rowIndex - 1 >= 0) {
			if (columnIndex - 1 >= 0) {
				neighbours.add(matrix[rowIndex - 1][columnIndex - 1]);
			}
			if (columnIndex + 1 < columns) {
				neighbours.add(matrix[rowIndex - 1][columnIndex + 1]);

			}
			neighbours.add(matrix[rowIndex - 1][columnIndex]);
		}
		if (rowIndex + 1 < rows) {
			if (columnIndex - 1 >= 0) {
				neighbours.add(matrix[rowIndex + 1][columnIndex - 1]);
			}
			if (columnIndex + 1 < columns) {
				neighbours.add(matrix[rowIndex + 1][columnIndex + 1]);
			}
			neighbours.add(matrix[rowIndex + 1][columnIndex]);
		}
		if (columnIndex - 1 >= 0) {
			neighbours.add(matrix[rowIndex][columnIndex - 1]);
		}

		if (columnIndex + 1 < columns) {
			neighbours.add(matrix[rowIndex][columnIndex + 1]);
		}
		return neighbours;
	}

	private static boolean isFibonacciSequence(Vector<Integer> neighbours) {
		int currentNumber;
		for (int k = 0; neighbours.size() < k; k++) {
			currentNumber = neighbours.get(k);
			if (!isFibonacciNumber(currentNumber)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkForFibonacciSequance(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				Vector<Integer> neighbours = getNeighbours(matrix, i, j);
				if (isFibonacciSequence(neighbours)) {
					return true;
				}

			}
		}
		return false;
	}

	public static void main(String args[]) {

	}

}
