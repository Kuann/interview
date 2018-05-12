package coding.interview.collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class UsingStack {

	@Test(expected = EmptyStackException.class)
	public void test_peek_on_empty_stack() {
		Stack<String> stack = new Stack<>();
		stack.peek();
	}
	
	@Test(expected = EmptyStackException.class)
	public void test_pop_on_empty_stack() {
		Stack<String> stack = new Stack<>();
		stack.pop();
	}
	
	@Test
	public void test_pop_on_stack() {
		Stack<String> stack = new Stack<>();
		stack.push("abc");
		assertThat(stack.pop(), is("abc"));
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void test_peek_on_stack() {
		Stack<String> stack = new Stack<>();
		stack.push("abc");
		assertThat(stack.peek(), is("abc"));
		assertFalse(stack.isEmpty());
	}
	
}
