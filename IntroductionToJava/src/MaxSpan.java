package firstweek;

public class MaxSpan {
	public int maxSpan(int[] numbers) {
		int maxSpan = 0;
		int tempSpan = 0;
		int sizeOfArray = numbers.length;

		for (int i = 0; i < sizeOfArray; i++) {
			for (int j = sizeOfArray - 1; j > i; j--) {
				if (numbers[i] == numbers[j]) {
					tempSpan = j - i;
					break;
				}
			}

			if (tempSpan > maxSpan) {
				maxSpan = tempSpan;
			}
		}
		return maxSpan + 1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 1, 3, 4 };
		int arr2[] = { 8, 12, 7, 1, 7, 2, 12 };
		int arr3[] = { 3, 6, 6, 8, 4, 3, 6 };
		MaxSpan m = new MaxSpan();
		System.out.println(m.maxSpan(arr));
		System.out.println(m.maxSpan(arr2));
		System.out.println(m.maxSpan(arr3));

	}

}
