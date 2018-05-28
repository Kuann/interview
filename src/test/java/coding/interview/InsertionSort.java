package coding.interview;

import java.util.Arrays;

public class InsertionSort {

	public static int[] sort(int[] arr) {
		
		for (int i = 1; i < arr.length; ++i) {
			int v = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > v) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = v;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 5, 3, 0, 4, 2, 8, 6, 9, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
