package queue;//Deque – Monotonic Queue)

import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class slidingWindowMaximum {// O(n),O(k)

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || k <= 0)
			return new int[0];// Handles invalid input.

		int n = nums.length;
		int[] res = new int[n - k + 1];
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < n; i++) {

			if (!deque.isEmpty() && deque.peekFirst() == i - k) {
				deque.pollFirst();
				
			}
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.pollLast();

			}
			deque.offerLast(i);
			if (i >= k - 1) {
				res[i - k + 1] = nums[deque.peekFirst()];
			}
		}
		return res;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		int[] ans = maxSlidingWindow(nums, k);
		System.out.println("Sliding Window Maximum : " + Arrays.toString(ans));
	}

}
