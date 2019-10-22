package firstweek;

import firstweek.OddNumber;

public class OddNumber {

	public boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		OddNumber o = new OddNumber();
		System.out.println(o.isOdd(10));
	}
}
