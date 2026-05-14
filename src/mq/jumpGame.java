package mq;//Greedy Algorithm,  Best & Simplest Approach

//Starting from index 0, determine whether you can reach the last index.
public class jumpGame {// O(n) ,O(1)
	public static boolean canJump(int[] nums) {

		int maxReach = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > maxReach) {
				return false;
			}
			maxReach = Math.max(maxReach, i + nums[i]);
		}
		return true;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 3, 1, 1, 4 };
//	int nums[] = {3,2,1,0,4};
		System.out.println("Can reach Last Index : " + canJump(nums));
	}
}
