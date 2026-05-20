package trees;//Recursive DFS (Postorder Traversal)

class TreeNode5 {// o(n),o(h)
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode5(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class lowestAccesstorInBinaryTree {
	// Function to find LCA in Binary Tree
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		// Base case
		if (root == null || root == p || root == q) {
			return root;
		}

		// Search in left and right subtrees
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		// If p and q found in different subtrees
		if (left != null && right != null) {
			return root;
		}

		// Else return non-null subtree
		return (left != null) ? left : right;
	}

	// Main method (Eclipse entry point)
	public static void main(String[] args) {

		/*
		 * 		3 
		 * 	   / \
		 *	  5   1 
		 *   / \ / \ 
		 *  6  2 0  8 
		 *    / \
		 *   7   4
		 */

		TreeNode root = new TreeNode(3);

		root.left = new TreeNode(5);
		root.right = new TreeNode(1);

		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);

		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);

		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);

		TreeNode p = root.left.left; // node 6
		TreeNode q = root.left.right.right; // node 4

		TreeNode lca = lowestCommonAncestor(root, p, q);

		System.out.println("Lowest Common Ancestor: " + lca.val);
	}
}
