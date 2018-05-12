package coding.interview.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class UsingIterator {
	
	@Test
	public void test() {
		List<String> list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Iterator<String> it = list.iterator();
		
		
		System.out.println("->");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(list);
	}

}
