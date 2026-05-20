package trees;//Postorder Traversal + Info Object (DP on Tree)

class BSTNode {// o(n),o(h)
	int val;
	BSTNode left;
	BSTNode right;

	BSTNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

//Helper class to store subtree information
class Info {
	boolean isBST;
	int size;
	int min;
	int max;

	Info(boolean isBST, int size, int min, int max) {
		this.isBST = isBST;
		this.size = size;
		this.min = min;
		this.max = max;
	}
}

public class largestBinarySearchTreeInBinaryTree {
	static int maxBSTSize = 0;

	public static Info largestBST(BSTNode root) {
		// Base case: empty tree is BST of size 0
		if (root == null) {
			return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
		}
		// Postorder traversal
		Info left = largestBST(root.left);
		Info right = largestBST(root.right);

		// Check BST condition
		if (left.isBST && right.isBST && left.max < root.val && root.val < right.min) {
			int currSize = left.size + right.size + 1;
			maxBSTSize = Math.max(maxBSTSize, currSize);
			int currMin = Math.min(root.val, left.min);
			int currMax = Math.max(root.val, right.max);
			return new Info(true, currSize, currMin, currMax);
		}
		// Not a BST
		return new Info(false, 0, 0, 0);
	}

	public static int largestBSTSubtree(BSTNode root) {
		largestBST(root);
		return maxBSTSize;
	}

	// Main method
	public static void main(String[] args) {

		/*
		 * 		 50
		 *  	/  \ 
		 *     30   60 
		 *    / \   / \ 
		 *   5  20 45 70 
		 *   		   \ 
		 *   		   80
		 */

		BSTNode root = new BSTNode(50);
		root.left = new BSTNode(30);
		root.right = new BSTNode(60);

		root.left.left = new BSTNode(5);
		root.left.right = new BSTNode(20);

		root.right.left = new BSTNode(45);
		root.right.right = new BSTNode(70);
		root.right.right.right = new BSTNode(80);

		int result = largestBSTSubtree(root);
		System.out.println("Size of largest BST in Binary Tree: " + result);
	}
}
