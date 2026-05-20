package trees;//Level Order Traversal (BFS)

import java.util.*;

class Node {// o(n),o(n)
	int val;
	Node left;
	Node right;
	Node next;

	Node(int val) {
		this.val = val;
		left = null;
		right = null;
		next = null;
	}
}

public class populatenextrightPointerInEachNode {
	public static Node connect(Node root) {

		if (root == null)
			return null;

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				Node curr = queue.poll();

				// connect to next node in same level
				if (i < size - 1) {
					curr.next = queue.peek();
				} else {
					curr.next = null;
				}

				if (curr.left != null) {
					queue.offer(curr.left);
				}

				if (curr.right != null) {
					queue.offer(curr.right);
				}
			}
		}

		return root;
	}

	// Print next pointers level-wise
	public static void printNextPointers(Node root) {

		Node levelStart = root; // for level by level 

		while (levelStart != null) {

			Node curr = levelStart;//to print all val in single level
			while (curr != null) {
				System.out.print(curr.val + " -> ");
				curr = curr.next;
			}
			System.out.println("null");

			levelStart = levelStart.left; //because 1 is 1st level 2 is sec level so from left 
		}
	}

	// Main method
	public static void main(String[] args) {

		/*
		 *   1 
		 *  / \ 
		 * 2   3 
		 * /\   \
		 *4 5    7
		 */

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(7);

		connect(root);

		System.out.println("Next Right Pointers:");
		printNextPointers(root);
	}
}
