package trees;//Recursion + HashMap (Index Lookup)
import java.util.*;
//Preorder → decides which node becomes root and in what order
//Inorder → decides how to split left and right subtrees

class TreeNode6 {//o(n),o(n)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode6(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class buildTreeFromPreorderAndInOrder {
	static int preorderIndex = 0;
    static Map<Integer, Integer> inorderMap = new HashMap<>();

    // Build tree helper
    public static TreeNode buildTreeHelper(int[] preorder, int inStart, int inEnd) {

        // Base case
        if (inStart > inEnd) {
            return null;
        }

        // Pick root from preorder
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Root index in inorder
        int inorderRootIndex = inorderMap.get(rootVal);

        // Build left and right subtrees
        root.left = buildTreeHelper(preorder, inStart, inorderRootIndex - 1);
        root.right = buildTreeHelper(preorder, inorderRootIndex + 1, inEnd);

        return root;
    }

    // Main build function
    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, inorder.length - 1);
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

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder  = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.print("Inorder traversal of constructed tree: ");
        printInorder(root);
    }
}
