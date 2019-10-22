package firstweek;

public class kthFactorial {
	public static long factorial(int n) {
		long product = 1;

		for (int i = 1; i <= n; i++) {
			product *= i;
		}
		return product;
	}

	public static long kFactorial(int k, int n) {
		long result = 1;

		for (int i = 0; i < k; i++) {
			result *= factorial(n);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(kFactorial(2, 3));
	}

}
