package mq;//Mathematical Formula (Sum of First n Natural Numbers)

public class MissingArrayPositive {// Optimal O(n), O(1)
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int n = arr[arr.length -1];
		int tsum = n * (n + 1) / 2;
		int arrSum = 0;
		for (int num : arr) {
			arrSum += num;
		}
		int MissingSum = tsum - arrSum;
		System.out.println("The missing number is : " + MissingSum);
	}
}
