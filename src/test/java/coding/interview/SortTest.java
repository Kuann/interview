package coding.interview;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SortTest {

	private boolean sorted(Integer[] arr) {
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] < arr[j - 1]) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void quickSortTest() {
		Integer[] arr = new Integer[] { 5,9,4  };
		new QuickSort<Integer>().sort(arr);
		assertTrue(sorted(arr));
	}
}