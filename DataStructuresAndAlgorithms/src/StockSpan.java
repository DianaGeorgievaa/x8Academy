package datastructures;

public class StockSpan {

	public int[] calculateSpan(int prices[]) {
		int[] span = new int[prices.length];
		span[0] = 1;
		int counter;
		for (int i = 1; i < prices.length; i++) {
			counter = 1;
			while ((i - counter) >= 0 && prices[i] > prices[i - counter]) {
				counter += span[i - counter];
			}
			span[i] = counter;
		}
		return span;
	}

	public static void main(String[] args) {
	}
}
