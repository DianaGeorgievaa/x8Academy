package firstweek;

import java.util.Arrays;

public class MaxScalarProductSolution {

	public static long maximalScalarSum(int[] a, int[] b) {
		if (a.length != b.length) {
			return -1;
		}

		long product = 0;
		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			product += a[i] * b[i];
		}
		return product;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2 };
		int arr2[] = { -6, -4, -5 };
		System.out.println(maximalScalarSum(arr, arr2));

	}

}
