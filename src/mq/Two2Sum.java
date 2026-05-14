package mq;//HashMap (One Pass)

import java.util.HashMap;

public class Two2Sum {// O(n),O(n)

	public static int[] twoSum(int[] nums, int tar) {
		HashMap<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int first = nums[i];
			int sec = tar - first;

			if (m.containsKey(sec)) {
				return new int[] { m.get(sec), i };
			}
			m.put(nums[i], i);
		}
		return new int[] { -1, -1 }; // -1 usually means “not found” [-1, -1] → no valid indices
	}

	public static void main(String[] args) {
		int nums[] = { 4, 2, 6, 7, 11, 15 };
		int tar = 9;
		int res[] = twoSum(nums, tar);
		System.out.println("Indexes :" + res[0] + " ," + res[1]);
	}
}
