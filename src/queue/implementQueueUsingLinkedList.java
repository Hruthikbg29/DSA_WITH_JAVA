//Implementation	Enqueue	Dequeue	Recommended
//ArrayList	        O(1)	❌ O(n)	❌ No
//LinkedList	    O(1)	O(1)	✅ Yes

// Queue Implementation using LinkedList Idea (BEST PRACTICE)

package queue;

import java.util.LinkedList;

public class implementQueueUsingLinkedList {
	private LinkedList<Integer> list;

	public implementQueueUsingLinkedList() {
		list = new LinkedList<>();
	}

	public void enqueue(int x) {
		list.addLast(x);
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		return list.removeFirst();
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return list.getFirst();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {
		implementQueueUsingLinkedList q = new implementQueueUsingLinkedList();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.println("Removed :" + q.dequeue());
		System.out.println("Top val :" + q.peek());
	}

}
