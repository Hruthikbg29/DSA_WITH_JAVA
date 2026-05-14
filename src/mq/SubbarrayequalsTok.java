package mq;//Prefix Sum + HashMap

import java.util.HashMap;

public class SubbarrayequalsTok {// O(n), O(n)

	public static int subarraySum(int[] arr, int k) {

		// HashMap to store prefix sums frequencies
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		int prefixSum = 0;

		for (int i = 0; i < arr.length; i++) {
			// Add current element to sum so far.
			prefixSum += arr[i];

			// If currSum is equal to desired sum
			// then a new subarray is found.
			if (prefixSum == k)
				res++;

			// Check if the difference exists in the prefixSums map.
			if (map.containsKey(prefixSum - k))
				res += map.get(prefixSum - k);

			// Add currSum to the set of prefix sums.
			// prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
			if (map.containsKey(prefixSum)) {
				map.put(prefixSum, map.get(prefixSum) + 1);
			} else {
				map.put(prefixSum, 1);
			}

		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6 };
		int k = 3;

		int arr[] = { 9, 4,0, 20, 3, 10, 5 };
		int k1 = 33;
//        		Output : 2
		System.out.println("Subarrays count: " + subarraySum(nums, k));
		System.out.println("Subarrays count: " + subarraySum(arr, k1));
	}
}
