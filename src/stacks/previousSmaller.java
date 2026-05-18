package stacks;//(Using Monotonic Stack)

import java.util.Arrays;
import java.util.Stack;

public class previousSmaller { // O(n) tc & sc both
	public static int[] prevSmall(int arr[]) {

		int n = arr.length;
		int[] res = new int[n];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			res[i] = stack.isEmpty() ? -1 : stack.peek();

			stack.push(arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 10, 8 };
		int[] pse = prevSmall(arr);

		System.out.println("Array :" + Arrays.toString(arr));
		System.out.println("PSE : " + Arrays.toString(pse));
	}
}
