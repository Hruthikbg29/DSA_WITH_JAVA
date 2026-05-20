package trees;//Range Validation (Min–Max Method)

class TreeNode15 {//o(n),o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode15(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class validateBinarySearchTree {
	// Helper method using min-max range
    public static boolean isValidBST(TreeNode root, long min, long max) {

        // Base case
        if (root == null) {
            return true;
        }

        // Check BST condition
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // to find particular left and right subtree min and max
        return isValidBST(root.left, min, root.val) &&
               isValidBST(root.right, root.val, max);
        
        //this says go for root.left and thier min for root is infite and max is always root
      //this says go for root.right and thier root value will be min  and max is always infnite
    }

    // Main validation to find min and max value for particular root val 
    // for root 5 max will +infinity and min will be -infinty
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        /*
                5
               / \
              1   7
                 / \
                6   8
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println("Is valid BST? " + isValidBST(root));
    }
}
