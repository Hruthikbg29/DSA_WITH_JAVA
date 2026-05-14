package mq;//Best & Optimized Approach

public class equlibriumIndex {// O(n) , O(1)
	public static int findEquiliIdx(int arr[]) {
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}

		int leftSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum -= arr[i];
			if (leftSum == totalSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 8, 3, 4, 1 };

		System.out.println("Edulibrium idx : " + findEquiliIdx(arr));

	}
}
