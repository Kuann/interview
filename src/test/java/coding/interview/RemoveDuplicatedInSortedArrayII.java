package coding.interview;

public class RemoveDuplicatedInSortedArrayII {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 3) {
			return nums.length;
		}

		int slow = 0;
		int fast = 1;

		while (fast < nums.length) {
			if (nums[fast] != nums[slow]
				|| slow == 0 
				|| nums[fast] != nums[slow - 1]) {
				nums[++slow] = nums[fast];
			}
			++fast;
		}

		return slow + 1;
	}
}
