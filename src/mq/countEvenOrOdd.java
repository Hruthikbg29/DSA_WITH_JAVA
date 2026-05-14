package mq;

public class countEvenOrOdd {// o(n) , o(1)

	public static void evenOdd(int[] nums) {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even count :" + even);
		System.out.println("odd coumt :" + odd);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		evenOdd(nums);
	}
}
