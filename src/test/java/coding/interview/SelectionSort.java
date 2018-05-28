package coding.interview;

import java.util.Arrays;

public class SelectionSort {

	public static int[] sort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; ++i) {
			int minIdex = i;
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[j] < arr[minIdex]) {
					minIdex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIdex];
			arr[minIdex] = tmp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 5, 3, 0, 4, 2, 8, 6, 9, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
