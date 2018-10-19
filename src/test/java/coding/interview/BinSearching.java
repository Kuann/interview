package coding.interview;

import org.junit.Test;

public class BinSearching {

	public static int binSearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid;

		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		
		System.out.println("lo: " + lo);
		return -1;
	}

	@Test
	public void test_bin_search() {
		binSearch(new int[] { 1, 3, 4, 5, 6, 7, 8, 9 }, 10);
	}

	public static int binSearchFirst(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (arr[mid] < key) {
				lo = mid + 1;
			} else if (arr[mid] > key || previousElementIsSatisfied(arr, key, mid)) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}

		return -(lo + 1);
	}

	private static boolean previousElementIsSatisfied(int[] arr, int key, int mid) {
		return mid > 0 && arr[mid - 1] == key;
	}

	@Test
	public void test_bin_search_first() {
		System.out.println(binSearchFirst(new int[] { 3, 3, 3, 3, 3, 9 }, 3));
	}
	
	public static int binSearchLast(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (arr[mid] > key) {
				hi = mid - 1;
			} else if (arr[mid] == key && (mid == arr.length - 1 || arr[mid + 1] != key)) {
				return mid;
			} else {
				// (arr[mid] < key)
				// or (arr[mid] == key and arr[mid + 1] == key)
				lo = mid + 1;
			}
		}

		return -(lo + 1);
	}

	@Test
	public void test_bin_search_last() {
		System.out.println(binSearchLast(new int[] { 1, 3, 3, 3, 3, 3, 9 }, 3));
	}

}
