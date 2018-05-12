package coding.interview.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class UsingListIterator {
	
	@Test
	public void test() {
		List<String> list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		ListIterator<String> it = list.listIterator();
		
		System.out.println("->");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("<-");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		it.remove();
		System.out.println(list);
	}
}
