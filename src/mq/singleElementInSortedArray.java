package mq;//Binary Search on Index Parity (Modified Binary Search)

public class singleElementInSortedArray {// O(log n) , O(1)
	public static int SingleEle(int[] nums) {
		int n = nums.length - 1;
		int st = 0;
		int end = n - 1;
		if (n == 1)
			return nums[0];

		while (st < end) {
			int mid = st + (end - st) / 2;

			if (mid == 0 && nums[0] != nums[1])
				return nums[mid];
			if (mid == n - 1 && nums[n - 1] != nums[n - 2])
				return nums[mid];
			if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1])
				return nums[mid];

			if (mid % 2 == 0) {
				if (nums[mid - 1] == nums[mid]) {
					end = mid - 1;
				} else {
					st = mid + 1;
				}
			} else {
				if (nums[mid - 1] == nums[mid]) {
					st = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return st;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int num[] = { 3, 3, 7, 7, 10, 11, 11 };
		System.out.println("Single Element :" + SingleEle(nums));
		System.out.println("Single Element :" + SingleEle(num));
	}
}
