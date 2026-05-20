package trees;//Postorder Traversal (Left → Right → Root)


class TreeNode8 {//o(n),o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode8(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class transformToSumTree {
	 // Converts tree to sum tree and returns sum of subtree
    public static int toSumTree(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Recursively get left and right subtree sums
        int leftSum = toSumTree(root.left);
        int rightSum = toSumTree(root.right);

        // Store old value
        int oldValue = root.val;

        // Update current node value
        root.val = leftSum + rightSum;

        // Return sum including original value
        return root.val + oldValue;
    }

    // Inorder traversal (for verification)
    public static void printInorder(TreeNode root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        /*
                10 (11+17)
               /  \
     (6+5)11 ,5    3 (14+3)17
             / \  / \
  	 (0 ,0) 2  4  6  8 (0 ,0)
              
        */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.print("Inorder before Sum Tree: ");
        printInorder(root);

        toSumTree(root);

        System.out.print("\nInorder after Sum Tree: ");
        printInorder(root);
    }
}
