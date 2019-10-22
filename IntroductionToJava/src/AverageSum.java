package firstweek;

public class AverageSum {
	public double getAverageSum(int array[]) {
		int sizeOfArray = array.length;
		double sumOfNumbers = 0;

		for (int i = 0; i < sizeOfArray; i++) {
			sumOfNumbers += array[i];
		}
		double averageSum = sumOfNumbers / sizeOfArray;
		return averageSum;
	}

	public static void main(String[] args) {
		int arr[] = { -5, -4, -3, -8, 0 };
		AverageSum a = new AverageSum();
		System.out.println(a.getAverageSum(arr));

	}

}
