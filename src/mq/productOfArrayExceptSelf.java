package mq;//Prefix Product + Suffix Product (Without Extra Arrays)

import java.util.Arrays;

public class productOfArrayExceptSelf {// O(n) ,O(1)
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];

		ans[0] = 1;
		for (int i = 1; i < n; i++) {
			ans[i] = ans[i - 1] * nums[i - 1];
		}

		int suffix = 1;
		for (int i = n - 2; i >= 0; i--) {

			suffix = suffix * nums[i + 1];
			ans[i] *= suffix;
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		int[] ans = productExceptSelf(nums);
		System.out.println("Product Array :" + Arrays.toString(ans));
	}
}
