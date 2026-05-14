package mq;// Single pass approach

public class thirdLargest {// o(n),o(1)
	public static int findThird(int[] arr) {
		if (arr == null || arr.length < 3) {
			return -1;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second) {
				third = second;
				second = num;
			} else if (num > third) {
				third = num;
			}

		}
		return third;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 4, 3, 50, 23, 90 };
		int res = findThird(arr);
		System.out.println("Third Largest Element :" + res);
	}
}
