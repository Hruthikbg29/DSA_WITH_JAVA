package mq; // two pointer technique

import java.util.*;

public class squareSortedArray {// o(n)tc, o(n)sc

	public static int[] sortedsq(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];

		int left = 0;
		int right = n - 1;
		int pos = n - 1;

		while (left <= right) {
			int leftSq = nums[left] * nums[left];
			int rightSq = nums[right] * nums[right];

			if (leftSq > rightSq) {
				ans[pos] = leftSq;
				left++;
			} else {
				ans[pos] = rightSq;
				right--;
			}
			pos--;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println("Sorted Nums are " + Arrays.toString(sortedsq(nums)));
	}
}
