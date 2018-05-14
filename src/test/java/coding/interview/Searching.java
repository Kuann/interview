package coding.interview;

public class Searching {

	public static int binSearch(int[] arr, int key) {
		int lo = 0 ;
		int ho = arr.length - 1;
		int mid;
		
		while (lo <= ho) {
			mid = (lo + ho) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				ho = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		
		return - (lo + 1);
	}
	
	
}
