package mq;// Single pass approach

public class fourtLargest {// o(n),o(1)
	public static int findFourth(int[] arr) {
		if (arr == null || arr.length < 4) {
			return -1;
		}

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		int fourth = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				fourth = third;
				third = second;
				second = first;
				first = num;
			} else if (num > second) {
				fourth = third;
				third = second;
				second = num;

			} else if (num > third) {
				fourth = third;
				third = num;
			} else if (num > fourth) {
				fourth = num;
			}
		}
		return fourth;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 4, 3, 50, 23, 90 };
		int res = findFourth(arr);
		System.out.println("Fourth Largest Element :" + res);
	}
}
