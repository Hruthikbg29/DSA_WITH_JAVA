package queue;//(Queue + Stack)

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class InterLeaveFirstHalfofAQueue {// O(n) , O(n)stack
	public static void interLeaveQueue(Queue<Integer> q) {

		int n = q.size();
		if (n % 2 != 0) {
			System.out.println("Queue size must be even");
			return;
		}
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n / 2; i++) {
			stack.push(q.poll());
		}

		while (!stack.isEmpty()) {
			q.offer(stack.pop());
		}

		for (int i = 0; i < n / 2; i++) {
			q.offer(q.poll());
		}

		for (int i = 0; i < n / 2; i++) {
			stack.push(q.poll());
		}

		while (!stack.isEmpty()) {
			q.offer(stack.pop());
			q.offer(q.poll());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();

		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		q1.offer(4);
		q1.offer(5);
		q1.offer(6);
		q1.offer(7);
		q1.offer(8);

		System.out.println("Original Queue :" + q1);

		interLeaveQueue(q1);
		System.out.println("Interleaved Queue :" + q1);
	}
}
