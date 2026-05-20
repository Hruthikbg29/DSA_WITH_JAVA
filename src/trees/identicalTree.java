package trees;//Recursive Tree Traversal (DFS)

class TreeNode {//o(n), o(h) height of the tree = h;
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class identicalTree {
	 // Method to check if two binary trees are identical
    public static boolean isIdentical(TreeNode root1, TreeNode root2) {

        // Case 1: both nodes are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // Case 2: one is null and the other is not
        if (root1 == null || root2 == null) {
            return false;
        }

        // Case 3: values are not equal
        if (root1.val != root2.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        // -------- Tree 1 --------
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        // -------- Tree 2 --------
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        // Check if trees are identical
        boolean result = isIdentical(root1, root2);
        System.out.println((result)?"Trees are IDENTICAL":"Trees are NOT identical");
       
    }
}
