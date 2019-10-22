package firstweek;

public class SmallestMultiple {

	public long getSmallestMultiple(int n) {
		long multiple = 1;
		boolean flag = true;

		while (true) {
			flag = true;
			for (int i = 1; i <= n; i++) {
				if (multiple % i != 0) {
					multiple++;
					flag = false;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		return multiple;
	}

	public static void main(String[] args) {
		SmallestMultiple s = new SmallestMultiple();
		System.out.println(s.getSmallestMultiple(6));
	}
}
