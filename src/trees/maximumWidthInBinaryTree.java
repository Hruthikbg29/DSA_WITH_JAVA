package trees;//Level Order Traversal (Node Count per Level bfs)
import java.util.*;

class TreeNode10 {//O(n),O(n)
    int val;
    TreeNode10 left;
    TreeNode10 right;

    TreeNode10(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class maximumWidthInBinaryTree {

    public static int maxWidth(TreeNode10 root) {

        if (root == null) return 0;

        Queue<TreeNode10> queue = new LinkedList<>();
        queue.offer(root);

        int maxWidth = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();   // number of nodes at current level
            maxWidth = Math.max(maxWidth, size);

            for (int i = 0; i < size; i++) {
                TreeNode10 curr = queue.poll();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }

        return maxWidth;
    }

    public static void main(String[] args) {


        TreeNode10 root = new TreeNode10(1);
        root.left = new TreeNode10(2);
        root.right = new TreeNode10(3);
        root.left.left = new TreeNode10(4);
        root.left.right = new TreeNode10(5);
        root.right.right = new TreeNode10(8);
        root.right.right.left = new TreeNode10(6);
        root.right.right.right = new TreeNode10(7);

        int result = maxWidth(root);
        System.out.println("Maximum number of nodes at any level: " + result);
    }
}
