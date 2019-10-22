package firstweek;

import java.util.Arrays;

public class KthMinElement {
	public int kthMin(int k, int[] array) {
		if (array.length == 0 || array.length < k) {
			return 0;
		}
		Arrays.sort(array);
		int minKthNumber = array[k];
		return minKthNumber;
	}

	public static void main(String[] args) {
		KthMinElement k = new KthMinElement();
		int arr[] = { 1, 2, 4, 5 };
		System.out.println(k.kthMin(10, arr));
	}

}
