package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	private QueueInterface q;

	@Before
	public void setUp() {
		this.q = new Queue();
	}

	@Test
	public void testEnqueueInEmptyQueue() {
		q.enqueue(1);
		q.enqueue(3);
		int size = q.getSize();
		assertEquals(2, size);
	}

	@Test
	public void testDequeueFromNotEmptyQueue() {
		q.enqueue(1);
		q.enqueue(3);
		q.dequeue();
		int size = q.getSize();
		assertEquals(1, size);
	}

	@Test
	public void testGetFirstElementInEmptyQueue() {
		int element = q.front();
		assertEquals(-2, element);
	}

	@Test
	public void testGetFirstElementsInNotEmptyQueue() {
		q.enqueue(1);
		q.enqueue(3);
		int element = q.front();
		assertEquals(1, element);
	}

}