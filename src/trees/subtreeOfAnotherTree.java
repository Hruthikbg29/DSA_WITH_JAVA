package trees;//Tree Traversal + Identical Tree Check (DFS)
class TreeNode1 {//o(n*m), o(h) :  n = nodes in main tree , m= nodein sub tree
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode1(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class subtreeOfAnotherTree {
	   // Function to check if two trees are identical
    public static boolean isIdentical(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return isIdentical(root1.left, root2.left) &&
               isIdentical(root1.right, root2.right);
    }

    // Function to check if subRoot is a subtree of root
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        // -------- Main Tree --------
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // -------- Sub Tree --------
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = isSubtree(root, subRoot);
        System.out.println((result) ? "subRoot is a subtree of root":"subRoot is NOT a subtree of root");

    }
}
