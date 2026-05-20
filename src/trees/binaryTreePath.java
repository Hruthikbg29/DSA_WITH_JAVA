package trees;//DFS + Backtracking (Preorder Traversal)

import java.util.*;

class TreeNode9 {// o(n),o(h)
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode9(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class binaryTreePath {
	// Helper DFS method
	public static void dfs(TreeNode root, String path, List<String> result) {

		if (root == null)
			return;

		// Add current node to path
		path += root.val;

		// If leaf node, add path to result
		if (root.left == null && root.right == null) {
			result.add(path);
			return;
		}

		// Continue traversal
		dfs(root.left, path + "->", result);
		dfs(root.right, path + "->", result);
	}

	// Main function
	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		dfs(root, "", result);
		return result;
	}

	// Main method (Eclipse entry point)
	public static void main(String[] args) {

		/*
		   1 
		  / \
		 2   3 
		  \
		   5
		 */

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);

		List<String> paths = binaryTreePaths(root);

		System.out.println("Binary Tree Paths:");
		for (String path : paths) {
			System.out.println(path);
		}
	}
}
