package stacks; //using pair stack,Monotonic Decreasing Stack (Stack of Indices)

import java.util.Arrays;
import java.util.Stack;

public class StackSpan {// O(n) ,o(n)

	public static int[] calculateSpan(int[] price) {
		int n = price.length;
		int[] ans = new int[n];

		Stack<Integer> stack = new Stack<>();

		ans[0] = 1;
		stack.push(0);

		for (int i = 1; i < n; i++) {
			while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
				stack.pop();
			}
			ans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

			stack.push(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] price = { 100, 80, 60, 70, 60, 75, 85 };
		int[] price1 = { 65, 80, 60, 70, 60, 75, 85 };

		int[] result = calculateSpan(price);
		int[] result1 = calculateSpan(price1);

		System.out.println("Stock Price :" + Arrays.toString(price));
		System.out.println("Stock Span : " + Arrays.toString(result));

		System.out.println("Stock Price :" + Arrays.toString(price1));
		System.out.println("Stock Span : " + Arrays.toString(result1));
	}
}
