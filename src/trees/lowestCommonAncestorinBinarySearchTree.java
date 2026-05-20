package trees;//BST Property + Recursion (or Iteration

class TreeNode18 {//o(h),O(h)-> (recursive call stack)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode18(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class lowestCommonAncestorinBinarySearchTree {
	// LCA using BST property
    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q) {

        if (root == null) return null;

        // Both nodes are smaller → go left
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // Both nodes are greater → go right
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        // Nodes are on different sides OR one equals root
        return root;
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        /*
                    6
                   / \
                  2   8
                 / \ / \
                0  4 7  9
                  / \
                 3   5
        */

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left.left;              // 0
        TreeNode q = root.left.right.right;  // 5

        TreeNode lca = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor: " + lca.val);
    }
}
