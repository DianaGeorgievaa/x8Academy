package firstweek;

public class Power {

	public long pow(int a, int b) {
		int product = 1;

		while (b > 0) {
			if ((b & 1) == 1) {
				product = product * a;
			}
			b = b >> 1;
			a = a * a;
		}
		return product;
	}

	public static void main(String[] args) {
		Power p = new Power();
		System.out.println(p.pow(2, 7));
	}
}
