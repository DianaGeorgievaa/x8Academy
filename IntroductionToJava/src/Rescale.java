package firstweek;

public class Rescale {
	public static int[][] rescale(int[][] original, int newHeight, int newWidth) {
		int[][] newImage = new int[newHeight][newWidth];
		int oldSize = original.length;
		int columnCount = 0;
		int scale = newHeight / oldSize;
		int rowCount = original.length;

		if (rowCount == 0) {
			return null;
		}
		columnCount = original[0].length;
		int resultRow = rowCount * scale;
		int resultCol = columnCount * scale;

		newImage = new int[resultRow][resultCol];
		int rows = 0;
		int count = 0;
		int cows;

		for (int i = 0; i < resultRow; i++) {
			cows = 0;
			for (int j = 0; j < columnCount; j++) {
				for (int k = 0; k < scale; k++) {
					newImage[i][cows] = original[rows][j];
					cows++;
				}
			}
			count++;
			if (count >= scale) {
				rows++;

				count = 0;
			}
		}
		return newImage;
	}

	public static void main(String[] args) {
		int[][] original = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] result = rescale(original, 6, 9);
		for (int i = 0; i < result.length; i++) {
			System.out.println();
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
		}

	}

}
