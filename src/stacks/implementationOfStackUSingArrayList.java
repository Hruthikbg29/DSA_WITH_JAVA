//Operation	Time
//push		O(1)
//pop		O(1)
//peek		O(1)
//sc = o(n)

package stacks;

import java.util.ArrayList;

public class implementationOfStackUSingArrayList {
	private ArrayList<Integer> list;

	public implementationOfStackUSingArrayList() {
		list = new ArrayList<>();
	}

	// Push
	public void push(int x) {
		list.add(x);
		System.out.println("Pushed Elements are :" + x);
	}

	// Pop
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		return list.remove(list.size() - 1);

	}

	// Peek
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return list.get(list.size() - 1);
	}

	// isEmpty
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {
		implementationOfStackUSingArrayList stack = new implementationOfStackUSingArrayList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);

		System.out.println("poped elements are :" + stack.pop()); // 60
		System.out.println("Peeked elements are :" + stack.peek()); // 50

	}
}
