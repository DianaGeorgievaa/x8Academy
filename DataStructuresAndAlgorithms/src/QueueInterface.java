package datastructures;

public interface QueueInterface {

	public void enqueue(int element);

	public int front();

	public void dequeue();

	public boolean isEmpty();

	public boolean isFull();

	public int getSize();

}
