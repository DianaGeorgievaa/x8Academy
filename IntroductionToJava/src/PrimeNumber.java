package firstweek;

public class PrimeNumber {
	public boolean isPrime(int n) {
		if (n < 0) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		System.out.println(p.isPrime(-9));
		System.out.println(p.isPrime(9));
		System.out.println(p.isPrime(0));
	}

}
