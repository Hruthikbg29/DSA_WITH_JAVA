package mq;//Floyd’s Cycle Detection Algorithm (Tortoise–Hare)

public class middleOfTheLinkedList {//O(n) , O(1)
	static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

	public static int middleValue(ListNode head) {

	    ListNode slow = head;
	    ListNode fast = head;

	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    return slow.val; // 🔥 only value
	}


    // helper to print list from a node
    public static void printFromNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int mid = middleValue(head);

        System.out.print("Middle Value : "+mid);
       
    }
}
