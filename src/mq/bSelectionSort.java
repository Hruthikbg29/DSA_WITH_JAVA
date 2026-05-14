package mq;//selecting the minimum element from the unsorted part of

//the array and placing it at the beginning.

import java.util.Arrays;//o(n*n),o(1)

public class bSelectionSort {
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 64, 25, 12, 22, 11 };
		selectionSort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
}
