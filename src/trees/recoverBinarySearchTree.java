package trees;//Inorder Traversal + Violation Detection

class TreeNode21 {//o(n),o(h)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode21(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class recoverBinarySearchTree {
	static TreeNode first = null;
    static TreeNode middle = null;
    static TreeNode last = null;
    static TreeNode prev = null;

    // Inorder traversal to find swapped nodes
    public static void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);

        if (prev != null && prev.val > root.val) {

            // First violation
            if (first == null) {
                first = prev;
                middle = root;
            }
            // Second violation
            else {
                last = root;
            }
        }

        prev = root;

        inorder(root.right);
    }

    public static void recoverTree(TreeNode root) {

        inorder(root);

        // Case 1: Non-adjacent nodes swapped
        if (first != null && last != null) {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        // Case 2: Adjacent nodes swapped
        else if (first != null && middle != null) {
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }

    // Inorder traversal for checking
    public static void printInorder(TreeNode root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // Main method
    public static void main(String[] args) {

        /*
             Swapped BST:
                 3
                / \
               1   4
                  /
                 2

             Correct BST should be:
                 2
                / \
               1   4
                  /
                 3
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        System.out.print("Before recovery (Inorder): ");
        printInorder(root);

        recoverTree(root);

        System.out.print("\nAfter recovery (Inorder): ");
        printInorder(root);
    }
}
