package mq;//two pointer approach

import java.util.*;

public class sort0sand1s {// o(n)tc o(1)sc

	public static int sort01(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;

		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 0, 1 };
		sort01(arr);
		System.out.println("Sorted 0s and 1s " + Arrays.toString(arr));
	}
}
