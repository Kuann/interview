package coding.interview;

import java.util.ArrayList;
import java.util.List;

public class BSTInorderTraversal {
	
	public void travel(TreeNode node, List<Integer> res) {
		if (node == null) {
			return;
		}
		
		travel(node.left, res);
		res.add(node.val);
		travel(node.right, res);
	}
	
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		travel(root, res);
		return res;
	}
}
