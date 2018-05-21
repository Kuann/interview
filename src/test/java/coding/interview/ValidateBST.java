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
		TreeNode c = root;
		TreeNode prev = null;
		Stack<TreeNode> stack = new Stack<>();
		
		while (c != null || !stack.isEmpty()) {
			while (c != null) {
				stack.push(c);
				c = c.left;
			}
			
			c = stack.pop();
			
			if (prev != null && prev.val >= c.val) {
				return false;
			}
			prev = c;
			c = c.right;
		}
		
		
		return true;
	}
}
