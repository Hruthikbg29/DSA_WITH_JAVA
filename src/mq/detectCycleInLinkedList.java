package mq;//Floyd’s Cycle Detection Algorithm (Slow & Fast Pointer)

public class detectCycleInLinkedList {// o(n) , 0(1)
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static boolean hasCycle(ListNode head) {

		if (head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next; // move 1 step
			fast = fast.next.next; // move 2 steps

			if (slow == fast) {
				return true; // cycle detected
			}
		}

		return false; // no cycle
	}

	public static void main(String[] args) {

		// Create nodes
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		// Link nodes
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second; // 🔥 creates cycle

		System.out.println("Cycle present: " + hasCycle(head));
	}
}
