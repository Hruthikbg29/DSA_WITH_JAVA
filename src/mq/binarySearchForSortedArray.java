package mq; //binary search (divide and conquer)

class binarySearchForSortedArray {// o(logn) o(1)
	public static int binSearch(int arr[], int tar) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == tar) {
				return mid;

			} else if (arr[mid] > tar) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 11 };
		int tar = 7;
		int res = binSearch(arr, tar);
		System.out.println((res != -1) ? "Elements found :" + res : "Elements not found");
	}
}
