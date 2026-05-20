package trees;//Iterative Binary Search (Two Pointers)

public class binarySearchIteration {// o(logn) , o(1)
	public static int binarySearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			// If target found
			if (arr[mid] == target) {
				return mid;
			}

			// Target is smaller → go left
			if (target < arr[mid]) {
				right = mid - 1;
			}
			// Target is larger → go right
			else {
				left = mid + 1;
			}
		}

		// Target not found
		return -1;
	}

	// Main method (Eclipse entry point)
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
		int target = 10;
		int index = binarySearch(arr, target);
		System.out.println((index != -1) ? "Target found at index: " + index : "Target not found");

	}
}
