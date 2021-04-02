package coding.interview;

import java.util.Stack;

public class QuickSort<T> implements Sorter<Integer> {

	public static class Pair {
		public Integer first, second;

		public static Pair init(Integer first, Integer second) {
			return new Pair(first, second);
		}

		private Pair(Integer first, Integer second) {
			this.first = first;
			this.second = second;
		}

	}

	@Override
	public void sort(Integer[] arr) {
		qsort(arr, 0, arr.length - 1);
	}
	
	private void qsort(Integer[] a, int from, int to) {
		int i = from;
		int j = to;
		int p = a[(from + to) / 2];
		
		while (i <= j) {
			while (a[i] < p) {
				++i;
			}
			
			while (a[j] > p) {
				--j;
			}
			
			if (i <= j) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				++i;
				--j;
			}
		}
		
		if (j > from) {
			qsort(a, from, j);
		}
		
		if (i < to) {
			qsort(a, i, to);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void qsortUsingStack(Integer[] arr) {
		Stack<Pair> stack = new Stack<>();
		stack.push(Pair.init(0, arr.length - 1));

		int i, j, pivot, temp;
		Pair p;
		while (!stack.isEmpty()) {
			p = stack.pop();
			i = p.first;
			j = p.second;
			pivot = arr[(i + j) / 2];

			while (i <= j) {
				while (arr[i] < pivot) {
					++i;
				}

				while (arr[j] > pivot) {
					--j;
				}
				if (i <= j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					++i;
					--j;
				}
			}

			if (p.first < j) {
				stack.push(Pair.init(p.first, j));
			}
			if (i < p.second) {
				stack.push(Pair.init(i, p.second));
			}
		}

	}

}
