package mq;//(Two-Pointer Technique)

public class TrappingRainWater {//// O(n) O(1)
	public static int trap(int[] height) {
		int left = 0, right = height.length - 1;
		int leftMax = 0, rightMax = 0;
		int water = 0;

		while (left < right) {
			if (height[left] <= height[right]) {
				if (height[left] >= leftMax) {
					leftMax = height[left];
				} else {
					water += leftMax - height[left];
				}
				left++;
			} else {
				if (height[right] >= rightMax) {
					rightMax = height[right];
				} else {
					water += rightMax - height[right];
				}
				right--;
			}
		}
		return water;
	}

	public static void main(String[] args) {
		int[] height = { 3, 0, 1, 0, 4, 0, 2 };
		System.out.println("Trapped Water :" + trap(height));
	}
}
