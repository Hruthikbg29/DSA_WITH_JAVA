package trees;//Divide & Conquer + Recursion

class TreeNode14 {//o(n),o(h)
    int val;
    TreeNode14 left;
    TreeNode14 right;

    TreeNode14(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class sortedArraytoBalancedBinarySearchTree {
	public static TreeNode14 sortedArrayToBST(int[] nums, int left, int right) {

        // Base case
        if (left > right) {
            return null;
        }

        // Choose middle element
        int mid = left + (right - left) / 2;

        TreeNode14 root = new TreeNode14(nums[mid]);

        // Build left and right subtrees
        root.left = sortedArrayToBST(nums, left, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, right);

        return root;
    }

    // Inorder traversal (for verification)
    public static void inorder(TreeNode14 root) {

        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
        
        
        
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        int[] nums = {-17,-15, -10, 0, 5, 9};
        
        /*
        0
       / \
    -10   5
       \    \
       -3    9
  
          */

        TreeNode14 root = sortedArrayToBST(nums, 0, nums.length - 1);

        System.out.print("Inorder Traversal of BST: ");
        inorder(root);
    }
}
