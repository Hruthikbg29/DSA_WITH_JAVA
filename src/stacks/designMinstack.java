package stacks;
import java.util.Stack;//using two stacks 

class minStack{
	private Stack<Integer>stack; //overall tc O(1) , sc O(n)
	private Stack<Integer>minStack;
	
	public minStack() {//constructor
		stack = new Stack<>();
		minStack = new Stack<>();
	}
	
	//push operation
	public void push(int val) {//O(1)
		stack.push(val);
		
		if(minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
			System.out.println("The value Enterd in minStack is  :"+val);
		}
	}

    // Pop operation
	public void pop() {//O(1)
		if(stack.isEmpty()) return;
		
		int removed = stack.pop();
		 // If removed element is minimum, pop from minStack
		if(!minStack.isEmpty() && removed == minStack.peek()) {
			minStack.pop();
		}
		System.out.println("values are poped");
	}
	 // Top operation
	public int top() {//O(1)
		if(stack.isEmpty()) return -1;
		return stack.peek();
	}
	
	public int getMin() {//O(1)
		if(minStack.isEmpty()) return -1;
		return minStack.peek();
	}
}


public class designMinstack {
public static void main(String[] args) {
	minStack m = new minStack();
	
	m.push(19);
	m.push(2);
	m.push(1);
	m.push(3);
	
	
	System.out.println("Top Elements : "+ m.top());
	System.out.println("Min Element :" + m.getMin());
	m.pop();
	m.pop();
	System.out.println("Top Elements : "+ m.top());
	System.out.println("Min Element :" + m.getMin());
	
	
}
}
