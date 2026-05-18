package stacks;//(Using ONE Queue)

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {// O(1),O(n)
	private Queue<Integer> queue;

	public StackUsingQueue() {
		queue = new LinkedList<>();
	}

	public void push(int x) {// 0(n)
		queue.offer(x);

		int size = queue.size();// Most important logic
		while (size > 1) {// Removes front element
			queue.offer(queue.poll());// Adds it back to the rear
			size--;// Repeats (size − 1) times [30,20,10]
		}
	}

	public int pop() {
		if (queue.isEmpty())
			return -1;
		return queue.poll();
	}

	public int top() {
		if (queue.isEmpty())
			return -1;
		return queue.peek();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}

public class implementStackUsingQueue {
	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println("Top Element : " + s.top());// 30
		System.out.println("pop : " + s.pop());// 30
		System.out.println("top element : " + s.top()); // 20

	}
}
