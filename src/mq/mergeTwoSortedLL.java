package mq;//Iterative Merge using Dummy Node (Two-Pointer Technique

public class mergeTwoSortedLL {

	    static class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }

	    // Print linked list
	    public static void printList(String name, ListNode head) {
	        System.out.print(name + " values: ");
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	    // Merge two sorted linked lists
	    public static ListNode mergeLists(ListNode l1, ListNode l2) {

	        ListNode dummy = new ListNode(-1);
	        ListNode tail = dummy;

	        while (l1 != null && l2 != null) {

	            if (l1.val <= l2.val) {
	                tail.next = l1;
	                l1 = l1.next;
	            } else {
	                tail.next = l2;
	                l2 = l2.next;
	            }
	            tail = tail.next;
	        }

	        // Attach remaining nodes
	        if (l1 != null) tail.next = l1;
	        if (l2 != null) tail.next = l2;

	        return dummy.next;
	    }

	    public static void main(String[] args) {

	        // List 1: 1 -> 3 -> 5 -> 7
	        ListNode l1 = new ListNode(1);
	        l1.next = new ListNode(3);
	        l1.next.next = new ListNode(5);
	        l1.next.next.next = new ListNode(7);

	        // List 2: 2 -> 3 -> 5 -> 6
	        ListNode l2 = new ListNode(2);
	        l2.next = new ListNode(3);
	        l2.next.next = new ListNode(5);
	        l2.next.next.next = new ListNode(6);
	        l2.next.next.next.next = new ListNode(8);

	        // Step 1: Print original lists
	        printList("List 1", l1);
	        printList("List 2", l2);

	        // Step 2: Merge lists
	        ListNode merged = mergeLists(l1, l2);

	        // Step 3: Print merged list
	        printList("Merged", merged);
	    }

}
