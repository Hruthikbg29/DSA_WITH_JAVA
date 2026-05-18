package stacks;//: Precompute Next Smaller Elements

import java.util.Stack;

public class LargestRectangleHistogram { // o(n)tc & SC both
	public static int LarRectArea(int[] heights) {

		Stack<Integer> stack = new Stack<>();

		int maxArea = 0;
		int n = heights.length;

		for (int i = 0; i < n; i++) {
			int currHeight = (i == n) ? 0 : heights[i];

			while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
				int ht = heights[stack.pop()];
				int width;

				if (stack.isEmpty()) {
					width = i;
				} else {
					width = i - stack.peek() - 1;
				}
				int area = ht * width;
				maxArea = Math.max(maxArea, area);
			}
			stack.push(i);

		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		System.out.println("Largest Rectangle Area :" + LarRectArea(heights));
	}
}
