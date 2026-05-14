package mq;//Iterative Pointer Reversal

public class commonValuesInTwoSortedLL {//O(n + m), o(1)

	 static class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }

	    // Print all values of a linked list
	    public static void printList(String name, ListNode head) {
	        System.out.print(name + " values: ");
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	    // Print common values between two sorted linked lists
	    public static void printCommonValues(ListNode l1, ListNode l2) {

	        ListNode p1 = l1;
	        ListNode p2 = l2;

	        System.out.print("Common values: ");

	        while (p1 != null && p2 != null) {

	            if (p1.val == p2.val) {
	                System.out.print(p1.val + " ");
	                p1 = p1.next;
	                p2 = p2.next;
	            }
	            else if (p1.val < p2.val) {
	                p1 = p1.next;
	            }
	            else {
	                p2 = p2.next;
	            }
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        // l1: 1 -> 3 -> 5 -> 7
	        ListNode l1 = new ListNode(1);
	        l1.next = new ListNode(2);
	        l1.next.next = new ListNode(5);
	        l1.next.next.next = new ListNode(7);

	        // l2: 2 -> 3 -> 5 -> 6
	        ListNode l2 = new ListNode(2);
	        l2.next = new ListNode(3);
	        l2.next.next = new ListNode(5);
	        l2.next.next.next = new ListNode(6);

	        // Step 1: print both lists
	        printList("List 1", l1);
	        printList("List 2", l2);

	        // Step 2: print common values
	        printCommonValues(l1, l2);
	    }
}
