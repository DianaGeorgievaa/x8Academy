package datastructures;

import java.util.LinkedList;
import java.util.List;

public class StackWithLinkedList implements StackInterface {

	private static final int ERROR_CODE_EMPTY_STACK = -5;

	private List<Integer> elements;

	StackWithLinkedList() {
		this.elements = new LinkedList<Integer>();
	}

	@Override
	public void push(int element) {
		this.elements.add(element);
	}

	@Override
	public void pop() {
		if (!this.isEmpty()) {
			int size = this.elements.size() - 1;
			this.elements.remove(size);
		}
	}

	@Override
	public int peek() {
		if (this.isEmpty()) {
			return ERROR_CODE_EMPTY_STACK;
		}

		int size = this.elements.size() - 1;
		int lastElement = this.elements.get(size);
		return lastElement;
	}

	@Override
	public int getSize() {
		int size = this.elements.size();
		return size;
	}

	private boolean isEmpty() {
		if (this.elements.size() == 0) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
	}
}
