package mq;//very simple approach

import java.util.Arrays;//o(n), 0(n)

public class leftRotateByOne {

	public static void leftRotateByOne(int[] arr) {
		int n = arr.length;
		int temp = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		leftRotateByOne(arr);
		System.out.println("Left rotated array " + Arrays.toString(arr));
	}
}
