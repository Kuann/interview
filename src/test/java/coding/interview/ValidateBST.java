package coding.interview;

import java.util.Stack;

public class ValidateBST {

	private boolean help(TreeNode node, TreeNode lowerBound, TreeNode upperBound) {
		if (node == null) {
			return true;
		}
		
		if (lowerBound != null && lowerBound.val >= node.val) {
			return false;
		}
		
		if (upperBound != null && upperBound.val <= node.val) {
			return false;
		}
		
		return help(node.left, lowerBound, node) && help(node.right, node, upperBound);
	}
	
	public boolean isValidBST_recursive(TreeNode root) {
		return help(root, null, null);
	}
	
	public boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode last = null;
		TreeNode cur = root;
		
		while (cur != null || !stack.isEmpty()) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			if (last != null && last.val >= cur.val) {
				return false;
			}
			last = cur;
			cur = cur.right;
		}
		return true;
	}
	/*
	 *             10
	 *            /  \
	 *          7     12
	 *        /  \
	 *       5    8
	 *        \
	 *         6
	 *        
	 *        [10, 7, 5]
	 *        5 [10, 7, 6]
	 *        6 [10, 7]
	 *        7 [10, 8]
	 *        8 [10]
	 *        10 [12]
	 *        12 []
	 *        
	 *        
	 * 
	 * */
}
