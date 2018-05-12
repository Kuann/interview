package coding.interview.collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import org.junit.Test;

public class UsingList {

	@Test(expected = NoSuchElementException.class)
	public void test_linked_list_get_first_of_empty_List() {
		LinkedList<String> list = new LinkedList<>();
		String element = list.getFirst();
		System.out.println(element);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void test_linked_list_get_last_of_empty_List() {
		LinkedList<String> list = new LinkedList<>();
		String element = list.getLast();
		System.out.println(element);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void test_remove_first_of_empty_List() {
		LinkedList<String> list = new LinkedList<>();
		list.removeFirst();
	}
}
