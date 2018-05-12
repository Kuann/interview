package coding.interview.collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class UsingQueue {

	@Test
	public void test_queue() {
		Queue<String> q = new LinkedList<>();
		q.add("abc");
		assertThat(q.peek(), is("abc"));
		assertThat(q.poll(), is("abc"));
		
		assertNull(q.peek());
		assertNull(q.poll());
		
		q.add("a");
		q.add("b");
		
		assertThat(q.poll(), is("a"));
	}
	
}
