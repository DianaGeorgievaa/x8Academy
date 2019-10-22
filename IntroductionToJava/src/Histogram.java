package firstweek;

public class Histogram {

	public int[] histogram(int[][] image) {
		int[] histogramResult = new int[256];
		int sizeOfImage = image.length;

		for (int i = 0; i < sizeOfImage; i++) {
			for (int j = 0; j < image[i].length; j++) {
				int currentNumber = image[i][j];
				histogramResult[currentNumber]++;
			}
		}
		return histogramResult;
	}

	public static void main(String[] args) {
		Histogram h = new Histogram();
		int[][] image = { { 1, 1, 1, 3, 4 }, { 5, 8, 6, 7, 7 } };
		int[] result = h.histogram(image);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
