package trees;//Level Order Traversal (BFS) + Horizontal Distance + Map

import java.util.*;

class TreeNode3 {// o(n),o(n)
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode3(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

//Helper class to store node with horizontal distance
class Pair {
	TreeNode node;
	int hd;

	Pair(TreeNode node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

public class topViewOfBinaryTree {// o(n) ,o(n)
	public static void topView(TreeNode root) {

		if (root == null)
			return;

		// TreeMap keeps keys sorted
		Map<Integer, Integer> map = new TreeMap<>();

		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(root, 0));

		while (!queue.isEmpty()) {

			Pair current = queue.poll();
			TreeNode node = current.node;
			int hd = current.hd;

			// Add only first node at each horizontal distance
			if (!map.containsKey(hd)) {
				map.put(hd, node.val);
			}

			if (node.left != null) {
				queue.offer(new Pair(node.left, hd - 1));
			}

			if (node.right != null) {
				queue.offer(new Pair(node.right, hd + 1));
			}
		}

		// Print top view
		for (int value : map.values()) {
			System.out.print(value + " ");
		}
	}

	// Main method (Eclipse entry point)
	public static void main(String[] args) {

		/*
		    1 0 
		   / \ 
       -1,2   3 +1
		   \ 
		    4-1,+1=0 
		      \
		       5 0+1=1
		         \ 6 1+1=2
		 */

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.left.right.right = new TreeNode(5);
		root.left.right.right.right = new TreeNode(6);

		System.out.print("Top View: ");
		topView(root);
	}
}
