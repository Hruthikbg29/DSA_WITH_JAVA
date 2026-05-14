package mq; //kadane algorithm 

public class MaximumSubarray {//o(n)
public static int maxSub(int [] nums) {
	int currSum = 0;
	int maxSum = 0;
	
	for(int val : nums) {
		currSum += val;
		
		maxSum = Math.max(currSum, maxSum);
		if(currSum <= 0) {
			currSum = 0;
		}
	}
	return maxSum;
}
public static void main(String[] args) {
	int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
	
	System.out.println("Maximum Subarray Sum : "+maxSub(nums));
}
}
