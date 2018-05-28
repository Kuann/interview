package coding.interview;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		
		for (int i = arr.length - 1; i > 0; --i) {
			int j = i;
			while (j > 0) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
				--j;
			}
		}
		
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 5, 3, 0, 4, 2, 8, 6, 9, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
