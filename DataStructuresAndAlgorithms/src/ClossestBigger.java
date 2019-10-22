package datastructures;

public class ClossestBigger {

	public int[] getClossestBigger(int[] numbers) {
		int next;
		int index = 0;
		int size=numbers.length;
		int[] clossestElements = new int[size];
		
		for (int i = 0; i < size; i++) {
			next = -1;
			for (int j = i + 1; j < size; j++) {
				if (numbers[i] < numbers[j]) {
					next = numbers[j];
					break;
				}
			}
			clossestElements[index] = next;
			index++;
		}
		return clossestElements;
	}

	public static void main(String[] args) {
	}
}
