package firstweek;

public class GetOccurence {
	public int getOccurence(int[] array) {
		int sizeOfArray = array.length;
		int countOccurences = 1;

		for (int i = 0; i < sizeOfArray; i++) {
			for (int j = 1; j < sizeOfArray - 1; j++) {
				if (array[i] == array[j])
					countOccurences++;
			}
			if (countOccurences % 2 != 0)
				return array[i];
		}
		return -1;

	}

	public static void main(String[] args) {

	}

}
