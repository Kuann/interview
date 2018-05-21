package coding.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Permutations {
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		sol(result, new LinkedList<>(), nums);
		return result;
	}

	private void sol(List<List<Integer>> result, LinkedList<Integer> temp, int[] nums) {
		if (temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
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