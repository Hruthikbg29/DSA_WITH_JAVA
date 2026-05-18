package stacks;

import java.util.Stack;

class JVMStack {
	private Stack<String> callStack;

	public JVMStack() {
		callStack = new Stack();
	}

	public void mePush(String meName) {
		callStack.push(meName);
		System.out.println(meName + " : Method called");
	}

	public void meReturn() {
		if (!callStack.empty()) {
			System.out.println(callStack.pop() + " : Method returned");
		}
	}

	public void displayStack() {
		System.out.println("Current Stack Displays top to bottom");
		for (int i = callStack.size() - 1; i >= 0; i--) {
			System.out.println(callStack.get(i));
		}
	}
}

public class JVMStackDemo {

	public static void main(String[] args) {
		JVMStack j1 = new JVMStack();

		j1.mePush("main");
		j1.mePush("Add");
		j1.mePush("Sub");
		j1.mePush("Mul");
		System.out.println("These are the method called");
		j1.displayStack();
		j1.meReturn();
		j1.meReturn();
		j1.displayStack();

	}
}
