package firstweek;

public class MatrixFibonacci {

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
	
	
	
	


}
