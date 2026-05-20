	package trees;//Single Traversal using BST Properties (O(h))
class TreeNod {//o(h), o(1)
    int val;
    TreeNod left;
    TreeNod right;

    TreeNod(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class inorderPreorderAndSuccessors {
	static TreeNod predecessor = null;
    static TreeNod successor = null;

    public static void findPreSuc(TreeNod root, int key) {

        while (root != null) {

            if (root.val == key) {
                // Find predecessor = max in left subtree
                if (root.left != null) {
                    TreeNod temp = root.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    predecessor = temp;
                }
                // Find successor = min in right subtree
                if (root.right != null) {
                    TreeNod temp = root.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    successor = temp;
                }
                return;
            }
   // Key is smaller → go left, update successor
            else if (key < root.val) {
                successor = root;
                root = root.left;
            }
   // Key is larger → go right, update predecessor
            else {
                predecessor = root;
                root = root.right;
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        /*
                    20
                   /  \
                 10    30
                / \    / \
               5  15  25  35
        */

        TreeNod root = new TreeNod(20);
        root.left = new TreeNod(10);
        root.right = new TreeNod(30);

        root.left.left = new TreeNod(5);
        root.left.right = new TreeNod(15);

        root.right.left = new TreeNod(25);
        root.right.right = new TreeNod(35);

        int key = 6;

        findPreSuc(root, key);

        System.out.println("Key: " + key);
        System.out.println("Inorder Predecessor: " +(predecessor != null ? predecessor.val : "null"));
        System.out.println("Inorder Successor: " +(successor != null ? successor.val : "null"));
    }
}
