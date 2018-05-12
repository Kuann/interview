package coding.interview;

import org.junit.Test;

public class Qsort {

	@Test
	public void t() {
		
	}
	
	
	private void qsort(int[] nums, int start, int end) {
		if (end <= start) {
			return;
		}
		
		int i = start,
			j = end;
		
		int pivot = nums[(start + end) / 2];
		
		while (i <= j) {
			while (nums[i] < pivot)
				++i;
			while (nums[j] < pivot)
				--j;
			
			if (i <= j) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				++i;
				++j;
			}
			
		}
		qsort(nums, start, j);
		qsort(nums, i, end);
	}
	
	
	
	
}
