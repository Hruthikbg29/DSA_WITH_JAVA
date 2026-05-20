package trees;//Level Order Traversal (BFS)
import java.util.*;

class TreeNode4 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode4(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class kthLevelOfBinaryTree {//o(n),o(n)
	
	// Function to print nodes at kth level
    public static void printKthLevel(TreeNode root, int k) {

        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // If current level is k, print all nodes in queue
            if (level == k) {
                for (TreeNode node : queue) {
                    System.out.print(node.val + " ");
                }
                return;
            }

            // Process current level
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            level++;
        }
    }

    // Main method (Eclipse entry point)
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(8);

        int k = 4;

        System.out.print("Nodes at level " + k + ": ");
        printKthLevel(root, k);
    }


}
