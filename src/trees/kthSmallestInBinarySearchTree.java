package trees;//Inorder Traversal (DFS)
class TreeNode17 {//o(n) ,o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode17(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class kthSmallestInBinarySearchTree {
	  	static int count = 0;
	    static int result = -1;

	    // Inorder traversal
	    public static void inorder(TreeNode root, int k) {

	        if (root == null) return;

	        inorder(root.left, k);

	        count++;
	        if (count == k) {
	            result = root.val;
	            return;
	        }

	        inorder(root.right, k);
	    }

	    public static int kthSmallest(TreeNode root, int k) {
	        inorder(root, k);
	        return result;
	    }

	    // Main method (Eclipse entry point)
	    public static void main(String[] args) {

	        /*
	               15
	               / \
	              13  16
	             / \
	            12   14
	           /
	          11
	        */

	        TreeNode root = new TreeNode(15);
	        root.left = new TreeNode(13);
	        root.right = new TreeNode(16);
	        root.left.left = new TreeNode(12);
	        root.left.right = new TreeNode(14);
	        root.left.left.left = new TreeNode(11);

	        int k = 3;

	        int ans = kthSmallest(root, k);
	        System.out.println("Kth smallest element: " + ans);
	    }
}
