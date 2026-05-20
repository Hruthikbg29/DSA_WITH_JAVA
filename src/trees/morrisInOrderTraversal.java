package trees;//Morris Traversal (Threaded Binary Tree Idea) without recursion and stack

//Morris Inorder Traversal is a high-level interview topic because it gives O(1) space traversal.
class TreeNode11 {// o(n),o(1)
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode11(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class morrisInOrderTraversal {
	public static void morrisInorder(TreeNode root) {

		TreeNode current = root;

		while (current != null) {

			// Case 1: No left child
			if (current.left == null) {
				System.out.print(current.val + " ");
				current = current.right;
			} else {// Case 2: Has left child
					// Find inorder predecessor
				TreeNode predecessor = current.left;

				while (predecessor.right != null && predecessor.right != current) {
					predecessor = predecessor.right;
				}

				// Create temporary thread
				if (predecessor.right == null) {
					predecessor.right = current;
					current = current.left;
				} else {// Remove thread
					predecessor.right = null;
					System.out.print(current.val + " ");
					current = current.right;
				}
			}
		}
	}

	// Main method
	public static void main(String[] args) {

		/*
		 * 1 / \ 2 3 /\ 4 5
		 * 
		 */

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);

		System.out.print("Morris Inorder Traversal: ");
		morrisInorder(root);
	}
}
