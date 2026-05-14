
package mq;//Sorting + Two Pointers (Fix Two Elements Technique)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four4Sum {// O(n³ * logn) , 0(1)
	public static List<List<Integer>> fourSum(int[] nums, int tar) {
		int n = nums.length;
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < n - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < n - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int p = j + 1, q = n - 1;

				while (p < q) {
					long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
					if (sum < tar) {
						p++;
					} else if (sum > tar) {
						q--;
					} else {
						ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
						while (p < q && nums[p] == nums[p + 1])
							p++;
						while (p < q && nums[q] == nums[q - 1])
							q--;

						p++;
						q--;

					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		System.out.println(fourSum(nums, target));
	}
}
