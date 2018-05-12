package coding.interview;

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
	
	public boolean isValidBST(TreeNode root) {
		return help(root, null, null);
	}
}
