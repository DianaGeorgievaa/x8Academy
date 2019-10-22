package firstweek;

public class Factorial {
	public long doubleFactorial(int n) {
		if (n < 0) {
			return -10;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * doubleFactorial(n - 2);
	}

	public static void main(String[] args) {

	}

}
