package mq;//compares adjacent elements and swaps them if they are in the wrong order.

import java.util.Arrays;

public class bubbleSort {// o(n*n) , o(n)
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
//					swap(arr[j] , arr[j+1]);
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 4, 2, 8 };
		bubbleSort(arr);

		System.out.println("Sorted Array :" + Arrays.toString(arr));
	}
}
