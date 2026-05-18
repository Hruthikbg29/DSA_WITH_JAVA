package stacks;

class SPGM {
	int[] stack;
	int topOfStack;

	public SPGM(int size) {
		stack = new int[size];
		topOfStack = -1;
	}

	public boolean isEmpty() {
		return topOfStack == -1;

	}

	public boolean isFull() {
		return topOfStack == stack.length - 1;

	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			stack[++topOfStack] = value;
			System.out.println("The value :" + value + "is added to stack");
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			int value = stack[topOfStack];
			topOfStack--;
			System.out.println("The removed value is " + value);
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("The peek is : " + stack[topOfStack]);
		}
	}

	public void delete() {
		stack = null;
		System.out.println("Stack is deleted");
	}
}

public class StackCreationUsingArray {

	public static void main(String[] args) {
		SPGM stack = new SPGM(4);

		System.out.println("Stack empty  :" + stack.isEmpty());
		System.out.println("Stack full : " + stack.isFull());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.peek();
		stack.delete();
//		stack.peek(); // Null pointer exception

	}
}
