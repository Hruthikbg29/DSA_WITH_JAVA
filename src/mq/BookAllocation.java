package mq;//Binary Search on Answer (Partition Binary Search)

public class BookAllocation {// o(logn * n) overall , o(1)
	public static boolean isValid(int arr[], int n, int m, int maPages) {
		int students = 1, pages = 0;

		for (int i = 0; i < n; i++) {// o(n)
			if (arr[i] > maPages) {
				return false;
			}
			if (pages + arr[i] <= maPages) {
				pages += arr[i];
			} else {
				students++;
				pages = arr[i];
			}
		}
		return students > m ? false : true;
	}

	public static int allocateBooks(int arr[], int n, int m) { // o(logn)
		if (m > n) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int ans = -1;
		int st = 0, end = sum;

		while (st <= end) {
			int mid = st + (end - st) / 2;

			if (isValid(arr, n, m, mid)) {
				ans = mid;
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 4 };
		int ar[] = { 12, 34, 67, 90 };
		int n = 4, m = 2;
		System.out.println("minimum maximum pages :" + allocateBooks(arr, n, m));
		System.out.println("minimum maximum pages :" + allocateBooks(ar, n, m));
	}
}
