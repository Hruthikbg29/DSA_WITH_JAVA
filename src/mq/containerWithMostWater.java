package mq;//Two Pointer Technique

public class containerWithMostWater { // o(n),0(1)
	public static int maxArea(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int maxArea = 0;

		while (left < right) {
			int width = right - left;
			int Height = Math.min(nums[left], nums[right]);

			int currArea = width * Height;
			maxArea = Math.max(maxArea, currArea);

			if (nums[left] < nums[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Maximum Water : " + maxArea(nums));
	}
}
