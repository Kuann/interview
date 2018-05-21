package coding.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Subset {
    public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		sol(result, new LinkedList<>(), nums);
		return result;
	}

	private void sol(List<List<Integer>> result, LinkedList<Integer> temp, int[] nums) {
		result.add(new ArrayList<>(temp));
		if (temp.size() == nums.length) {
			return;
		}
		for (int v: nums) {
			if (!temp.contains(v)) {
				temp.add(v);
				sol(result, temp, nums);
				temp.removeLast();
			}
		}
	}
}