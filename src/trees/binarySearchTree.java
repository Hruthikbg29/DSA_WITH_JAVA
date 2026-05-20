package trees;//Binary Search Tree (BST)

class TreeNode13 {// Search / Insert / Delete → O(log n) , o(h)
	int val;// worst case o(n)
	TreeNode left;
	TreeNode right;

	TreeNode13(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class binarySearchTree {

	public static TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	// 2️⃣ Search in BST
	public static boolean search(TreeNode root, int key) {
		if (root == null) {
			return false;
		}
		if (root.val == key) {
			return true;
		}
		if (key < root.val) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}

	// 3️⃣ Inorder Traversal (Sorted Order)
	public static void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	// Main method
	public static void main(String[] args) {
		int[] values = { 5, 1, 3, 4, 2, 7 };
		TreeNode root = null;
		// Build BST
		for (int val : values) {
			root = insert(root, val);
		}
		System.out.print("Inorder Traversal (Sorted): ");
		inorder(root);
		int key = 7;
		System.out.println("\nSearch " + key + ": " + search(root, key));
	}
}
