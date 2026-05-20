
package trees;//Postorder traversal is the driving traversal

import java.util.*;

class TreeNode7 {// o(n),o(n)
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode7(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class buildTreeFromInOrderAndPostorder {
	static int postIndex;
	static Map<Integer, Integer> inorderMap = new HashMap<>();

	// Helper function
	public static TreeNode buildHelper(int[] inorder, int[] postorder, int inStart, int inEnd) {

		// Base case
		if (inStart > inEnd) {
			return null;
		}

		// Pick root from postorder
		int rootVal = postorder[postIndex--];
		TreeNode root = new TreeNode(rootVal);
		int inorderIndex = inorderMap.get(rootVal);// Find root in inorder
		root.right = buildHelper(inorder, postorder, inorderIndex + 1, inEnd);// IMPORTANT: build right subtree first
		root.left = buildHelper(inorder, postorder, inStart, inorderIndex - 1);

		return root;
	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		postIndex = postorder.length - 1;
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}
		return buildHelper(inorder, postorder, 0, inorder.length - 1);
	}

	// Inorder traversal for verification
	public static void printInorder(TreeNode root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.val + " ");
		printInorder(root.right);
	}

	// Main method
	public static void main(String[] args) {

		int[] inorder = { 9, 3, 15, 20, 7 };
		int[] postorder = { 9, 15, 7, 20, 3 };

		TreeNode root = buildTree(inorder, postorder);

		System.out.print("Inorder traversal of constructed tree: ");
		printInorder(root);
	}
}
