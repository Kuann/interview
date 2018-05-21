package coding.interview.collections;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

public class UsingDeque {

	@Test
	public void test_deque() {
		Deque<String> dq = new LinkedList<>();
		dq.addLast("a");
		dq.addFirst("b");
		dq.getFirst();
		dq.getLast();
	}
}
