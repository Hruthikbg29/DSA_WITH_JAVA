package mq;

import java.util.Arrays;

public class moveZeroesToEnd {
	public static void MoveZeroes(int arr[]) {
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 0, 3, 0, 5, 0, 0, 16, 12 };
		MoveZeroes(arr1);
		System.out.println("Modified array 1: " + Arrays.toString(arr1));
	}
}
