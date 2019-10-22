package firstweek;

import java.util.Arrays;

public class AverageMinNumber {
	public int getAverage(int[] array) {
		Arrays.sort(array);
		int sizeOfArray = array.length;
		int averageIndex = sizeOfArray / 2;
		int averageElement = array[averageIndex];

		return averageElement;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 4, 3, 9, 0 };
		AverageMinNumber a = new AverageMinNumber();
		System.out.println(a.getAverage(arr));

	}
}
