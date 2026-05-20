package trees;//Inorder Traversal + Merge Two Sorted Lists

import java.util.*;
//Inorder traversal BST1 → O(n)
//Inorder traversal BST2 → O(m)
class TreeNode20 {//O(n + m) ,  O(n + m)
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode20(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class mergeTwoSortedBinarySearchTree {
	 // Inorder traversal
    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // Merge two sorted lists
    public static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2) {

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                result.add(l1.get(i++));
            } else {
                result.add(l2.get(j++));
            }
        }

        while (i < l1.size()) {
            result.add(l1.get(i++));
        }

        while (j < l2.size()) {
            result.add(l2.get(j++));
        }

        return result;
    }

    // Merge two BSTs
    public static List<Integer> mergeBSTs(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        return mergeLists(list1, list2);
    }

    // Main method
    public static void main(String[] args) {

        /*
            BST 1:
                3
               / \
              1   5

            BST 2:
                4
               / \
              2   6
        */

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(6);

        List<Integer> merged = mergeBSTs(root1, root2);

        System.out.println("Merged BST elements (sorted): " + merged);
    }
}
