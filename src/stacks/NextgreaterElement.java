package stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextgreaterElement {// using Stack

	public static int[] nextGreater(int[] arr) {// tc o(n) O(n)sc
		int n = arr.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {

			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}

			result[i] = stack.isEmpty() ? -1 : stack.peek();

			stack.push(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 25 };

		int[] nge = nextGreater(arr);

		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("NGE : " + Arrays.toString(nge));
	}
}
