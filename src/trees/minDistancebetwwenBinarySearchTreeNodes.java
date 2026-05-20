package trees;//Inorder Traversal (Sorted Order Traversal)
class TreeNode16 {//o(n),o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode16(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class minDistancebetwwenBinarySearchTreeNodes {
	static Integer prev = null;   // previous inorder value
    static int minDiff = Integer.MAX_VALUE;

    // Inorder traversal
    public static void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);

        // Compare with previous node
        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }

        prev = root.val;

        inorder(root.right);
    }

    public static int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        /*
                4
               / \
              2   6
             / \
            1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int result = minDiffInBST(root);
        System.out.println("Minimum distance between BST nodes: " + result);
    }
}
