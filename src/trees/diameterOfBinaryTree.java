package trees;//DFS (Postorder Traversal) + Height Calculation


class TreeNode2 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode2(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class diameterOfBinaryTree {//o(n) , o(h)
	 static int diameter = 0;

	    // Function to calculate height and update diameter
	    public static int height(TreeNode root) {

	        // Base case
	        if (root == null) {
	            return 0;
	        }

	        // Height of left subtree
	        int leftHeight = height(root.left);

	        // Height of right subtree
	        int rightHeight = height(root.right);

	        // Update diameter
	        diameter = Math.max(diameter, leftHeight + rightHeight);

	        // Return height of current node
	        return 1 + Math.max(leftHeight, rightHeight);
	    }

	    public static int diameterOfBinaryTree(TreeNode root) {
	        height(root);
	        return diameter;
	    }

	    // Main method (Eclipse entry point)
	    public static void main(String[] args) {

	        /*
	                1
	               / \
	              2   3
	             / \
	            4   5
	        */

	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);

	        int result = diameterOfBinaryTree(root);

	        System.out.println("Diameter of Binary Tree: " + result);
	    }
}
