package trees;//Recursion + Upper Bound (BST Property)

class TreeNode19 {//o(n),o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode19(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class constructBinarySearchTreeFromPreOrder {
	static int index = 0;

    // Build BST using preorder and upper bound
    public static TreeNode buildBST(int[] preorder, int bound) {

        // Base case
        if (index == preorder.length || preorder[index] > bound) {
            return null;
        }

        // Create root
        TreeNode root = new TreeNode(preorder[index++]);

        // Left subtree: values < root.val
        root.left = buildBST(preorder, root.val);

        // Right subtree: values < bound
        root.right = buildBST(preorder, bound);

        return root;
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        return buildBST(preorder, Integer.MAX_VALUE);
    }

    // Inorder traversal for verification
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        int[] preorder = {6, 3, 1, 4, 8, 9};

        TreeNode root = bstFromPreorder(preorder);

        System.out.print("Inorder traversal of constructed BST: ");
        inorder(root);
        
        
        /*
         
  		6
       / \
      3   8
     / \    \
    1   4    9

         */
    }
}
