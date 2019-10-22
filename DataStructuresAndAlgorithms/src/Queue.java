package datastructures;

public class Queue implements QueueInterface {

	private static final int MAX_SIZE = 100;
	private static final int ERROR_CODE_EMPTY_QUEUE = -2;

	private int[] elements;
	private int size;

	Queue() {
		this.elements = new int[MAX_SIZE];
		this.size = 0;
	}

	@Override
	public void enqueue(int element) {
		if (this.isFull()) {
			this.resize();
		}
		this.elements[this.size] = element;
		this.size++;
	}

	@Override
	public int front() {
		if (this.isEmpty()) {
			return ERROR_CODE_EMPTY_QUEUE;
		}
		int frontElement = this.elements[0];
		return frontElement;
	}

	@Override
	public void dequeue() {
		//TODO add exception
		if (!this.isEmpty()) {
			this.size--;
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (this.size == MAX_SIZE) {
			return true;
		}
		return false;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	private void resize() {
		int size = this.getSize() * 2;
		int[] queue = new int[size];
		for (int i = 0; i < elements.length; i++) {
			queue[i] = elements[i];
		}
		this.elements = queue;
	}

	public static void main(String args[]) {
	}
}
