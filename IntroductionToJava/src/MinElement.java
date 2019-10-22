package firstweek;

import java.util.Arrays;

public class MinElement {
	private static final int INVALID_NUMBER = -1000;

	public int getMinElement(int arr[]) {
		if (arr.length == 0) {
			return INVALID_NUMBER;
		}
		Arrays.sort(arr);
		int minNumber = arr[0];
		return minNumber;
	}

	public static void main(String[] args) {
		int arr[] = {};
		MinElement m = new MinElement();
		System.out.println(m.getMinElement(arr));
	}

}
