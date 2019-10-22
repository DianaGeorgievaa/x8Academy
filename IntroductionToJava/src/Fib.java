package firstweek;

import java.util.Scanner;

public class Fib {

	public static boolean isFibonacciNumber(int number) {
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

	public static int getPreviousFibonacciNumber(int number) {
		int fibonacciSum = 1;
		int start = 0;
		int tempSum = 0;
		while (fibonacciSum < number) {
			tempSum = fibonacciSum;
			fibonacciSum += start;
			start = tempSum;
		}
		return start;

	}

	public static boolean thereIsFibonacciSquareWithSize(int fibSquareSize, int[][] a, int i, int j) {
		int row = i;
		int col;

		int previous = a[i][j];

		for (col = j + 1; col < a.length && col < j + fibSquareSize; col++) {
			if (getPreviousFibonacciNumber(a[row][col]) == previous) {
				previous = a[row][col];
			} else {
				return false;
			}
		}
		col--;

		for (row = i + 1; row < a.length && row < i + fibSquareSize; row++) {
			if (getPreviousFibonacciNumber(a[row][col]) == previous) {
				previous = a[row][col];
			} else {
				return false;
			}
		}
		row--;

		for (col = j + fibSquareSize - 2; col >= j; col--) {
			if (isFibonacciNumber(a[row][col]) && getPreviousFibonacciNumber(a[row][col]) == previous) {
				previous = a[row][col];
			} else {
				return false;
			}
		}
		col++;

		for (row = i + fibSquareSize - 2; row > i; row--) {
			if (isFibonacciNumber(a[row][col]) && getPreviousFibonacciNumber(a[row][col]) == previous) {
				previous = a[row][col];
			} else {
				return false;
			}
		}

		return true;
	}

	public static boolean fibonacciSquareStartsFrom(int[][] a, int i, int j) {
		if (i < 0 || i >= a.length || j < 0 || j >= a.length || !isFibonacciNumber(a[i][j])) {
			return false;
		}

		int br = 1, column = j + 1;

		while (column < a.length && isFibonacciNumber(a[i][column])
				&& getPreviousFibonacciNumber(a[i][column]) == a[i][column - 1]) {
			br++;
			column++;
		}

		for (int fibSquareSize = 2; fibSquareSize <= br; fibSquareSize++) {
			if (thereIsFibonacciSquareWithSize(fibSquareSize, a, i, j)) {
				return true;
			}
		}

		return false;
	}

	public static boolean fibonacciSquareShorter(int[][] a) {
		int size = a.length;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (fibonacciSquareStartsFrom(a, i, j)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
//			n = in.nextInt();
		int a[][] = /* new int[n][n] */ { { 2, 3, 5 }, 
				                          { 7, 5, 8 }, 
				                        { 33, 21, 13 } };
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					a[i][j] = in.nextInt();
//				}
//			}
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(a[i][j] + "  ");
//				}
//				System.out.println();
//			}
		if (fibonacciSquareShorter(a)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		in.close();
	}
};
