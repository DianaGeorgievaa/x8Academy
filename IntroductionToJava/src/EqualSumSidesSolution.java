package firstweek;

public class EqualSumSidesSolution {

	public boolean equalSumSides(int[] numbers) {
		int leftSum = 0;
		int rightSum = 0;
		int size = numbers.length;

		for (int i = 1; i < size; i++) {
			rightSum += numbers[i];
		}

		int index = 0;
		for (int j = 1; j < size; j++) {
			rightSum -= numbers[j];
			leftSum += numbers[index];
			index++;

			if (leftSum == rightSum)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, -1, 2, 1 };
		int[] arr2 = { 2, 1, 2, 3, 1, 4 };
		int[] arr3 = { 8, 8 };
		EqualSumSidesSolution e = new EqualSumSidesSolution();
		System.out.println(e.equalSumSides(arr));
		System.out.println(e.equalSumSides(arr2));
		System.out.println(e.equalSumSides(arr3));
	}

}
