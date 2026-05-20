package trees;

class TreeNode33 {
    int val;
    TreeNode33 left;
    TreeNode33 right;

    TreeNode33(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class maxDistancebetwwenBinarySearchTreeNodes {
	static int maxDistance = 0; // stores diameter (edges)

    // Height calculation + diameter update
    public static int height(TreeNode root) {

        // Base case
        if (root == null) return 0;

        // Postorder traversal
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Update maximum distance
        maxDistance = Math.max(maxDistance, leftHeight + rightHeight);

        // Return height of subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int maxDistanceInBST(TreeNode root) {
        maxDistance = 0;   // reset before computation
        height(root);
        return maxDistance;
    }

    // Main method
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

        int result = maxDistanceInBST(root);
        System.out.println("Maximum distance between BST nodes: " + result);
    }
}
