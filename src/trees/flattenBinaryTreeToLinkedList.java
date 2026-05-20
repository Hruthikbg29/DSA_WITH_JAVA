package trees;//Inorder Traversal (Left → Root → Right)
class TreeNode12 {//o(n),o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode12(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class flattenBinaryTreeToLinkedList {
	 	static TreeNode prev = null;   // previously visited node
	    static TreeNode head = null;   // head of linked list

	    // Inorder traversal to flatten BST
	    public static void flattenBST(TreeNode root) {

	        if (root == null) return;

	        // Left subtree
	        flattenBST(root.left);

	        // Process current node
	        if (prev == null) {
	            head = root;          // first node (smallest)
	        } else {
	            prev.right = root;    // link previous to current
	        }

	        root.left = null;         // left should be null
	        prev = root;              // move prev

	        // Right subtree
	        flattenBST(root.right);
	    }

	    // Print linked list
	    public static void printLinkedList(TreeNode head) {
	        TreeNode curr = head;
	        while (curr != null) {
	            System.out.print(curr.val + " ->");
	            curr = curr.right;
	        }
	        System.out.println("null");
	    }

	    // Main method (Eclipse entry point)
	    public static void main(String[] args) {

	        /*
	                4
	               / \
	              2   6
	             / \ / \
	            1  3 5  7
	        */

	        TreeNode root = new TreeNode(4);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(6);
	        root.left.left = new TreeNode(1);
	        root.left.right = new TreeNode(3);
	        root.right.left = new TreeNode(5);
	        root.right.right = new TreeNode(7);

	        flattenBST(root);

	        System.out.print("Flattened Linked List: ");
	        printLinkedList(head);
	    }
}
