package coding.interview;

public class RemoveDuplicatedInSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}

		int slow = 0;
		int fast = 1;
		
		while (fast < nums.length) {
			if (nums[fast] != nums[slow]) {
				nums[++slow] = nums[fast];
			}
			++fast;
		}

		return slow + 1;
	}
}
