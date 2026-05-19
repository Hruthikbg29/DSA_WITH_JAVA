package queue;//(Using TWO Stacks)

import java.util.Stack;

class QueueUsingStack { // O(1),O(n)

	private Stack<Integer> inStack;
	private Stack<Integer> outStack;

	public QueueUsingStack() {
		inStack = new Stack();
		outStack = new Stack();
	}

	public void enqueue(int x) {
		inStack.push(x);
		System.out.println(x + ",");
	}

	public int dequeue() {
		if (isEmpty())
			return -1;
		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}

	public int peek() {
		if (isEmpty())
			return -1;
		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}

		return outStack.peek();
	}

	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
}

public class implementQueuesUsingStacks {
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("Dequeue : " + q.dequeue());
		q.enqueue(50);
		System.out.println("Front : " + q.peek());
		System.out.println("Dequeue : " + q.dequeue());
		System.out.println("Front : " + q.peek());
	}
}
