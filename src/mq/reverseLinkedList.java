package mq;//Iterative Pointer Reversal,also called three pointer technique

public class reverseLinkedList {// o(n),0(1)
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		
		while (curr != null) {
			next = curr.next; // store next node
			curr.next = prev; // reverse link
			prev = curr; // move prev forward
			curr = next; // move curr forward
		}

		return prev; // new head
	}

	// helper to print list
	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		System.out.print("Original: ");
		printList(head);

		head = reverseList(head);

		System.out.print("Reversed: ");
		printList(head);
	}
}
