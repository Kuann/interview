package coding.interview.collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.PriorityQueue;

import org.junit.Test;

public class UsingPriorityQueue {

	@Test
	public void test() {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("b");
		pq.add("a");
		pq.add("a");
		
		assertThat(pq.poll(), is("a"));
		assertThat(pq.poll(), is("a"));
		assertThat(pq.poll(), is("b"));
		assertNull(pq.peek());
		assertNull(pq.poll());
	}
}
