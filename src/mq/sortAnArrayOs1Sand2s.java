package mq;//Dutch National Flag Algorithm (3 Pointers)

import java.util.Arrays;//O(n) ,O(1)

public class sortAnArrayOs1Sand2s {
	public static void sort012(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {
			if (nums[mid] == 0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;

			} else if (nums[mid] == 1) {
				mid++;
			} else {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 0, 2, 1, 1, 0, 0, 0, 1 };
		sort012(arr);
		System.out.println("Sorted Array " + Arrays.toString(arr));
	}
}
