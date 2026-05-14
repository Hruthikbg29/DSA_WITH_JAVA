package mq;//Floyd’s Tortoise and Hare Algorithm (Cycle Detection)

public class findDuplicatesUsingSlowAndFaster {// O(n) ,O(1)
	public static int findDup(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);
		slow = nums[0];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 3, 4, 2 };
		int arr[] = { 1, 2, 3, 4, 2, 7, 8 };
		System.out.println("Duplicates are : " + findDup(nums));
		System.out.println("Duplicates are : " + findDup(arr));

	}

}
