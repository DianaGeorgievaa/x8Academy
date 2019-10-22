package datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private StackInterface s;

	@Before
	public void setUp() {
		this.s = new Stack();
	}

	@Test
	public void testPushNumbersInEmptyStack() {
		s.push(1);
		s.push(3);
		int size = s.getSize();
		assertEquals(2, size);
	}

	@Test
	public void testPopFromNotEmptyStack() {
		s.push(1);
		s.push(3);
		s.pop();
		int size = s.getSize();
		assertEquals(1, size);
	}

	@Test
	public void testPeekInEmptyStack() {
		int element = s.peek();
		assertEquals(-2, element);
	}

	@Test
	public void testPeekInNotEmptyStack() {
		s.push(1);
		s.push(3);
		int element = s.peek();
		assertEquals(3, element);
	}

}
