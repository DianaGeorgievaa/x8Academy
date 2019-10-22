package datastructures;

public class Stack implements StackInterface {

	private static final int MAX_SIZE = 100;
	private static final int ERROR_CODE_EMPTY_STACK = -2;

	private int[] elements;
	private int top;
	private int size;

	Stack() {
		this.top = -1;
		this.elements = new int[MAX_SIZE];
		this.size = 0;
	}

	@Override
	public void push(int element) {
		if (this.isFull()) {
			this.resize();
		}
		this.top++;
		this.elements[this.top] = element;
		this.size++;
	}

	@Override
	public void pop() {
		// TODO add exception if isEmpty
		if (!this.isEmpty()) {
			this.top--;
			this.size--;
		}
	}

	@Override
	public int peek() {
		if (this.isEmpty()) {
			return ERROR_CODE_EMPTY_STACK;
		}
		int element = elements[this.top];
		return element;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	private boolean isEmpty() {
		if (this.getSize() == 0) {
			return true;
		}
		return false;
	}

	private boolean isFull() {
		if (this.getSize() == MAX_SIZE) {
			return true;
		}
		return false;
	}

	private void resize() {
		int size = this.getSize() * 2;
		int[] stack = new int[size];
		for (int i = 0; i < elements.length; i++) {
			stack[i] = elements[i];
		}
		this.elements = stack;
	}

	public static void main(String[] args) {

	}
}
