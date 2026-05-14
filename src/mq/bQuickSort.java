package mq;//Quick Sort is a divide and conquer sorting algorithm.

import java.util.Arrays;//O(n log n)tc,   O(log n) (recursion stack)sc

public class bQuickSort {
	// Main quick sort function

	public static int actualPivot(int arr[], int low, int high) {
		int pivot = high;
		int j = low - 1;

		for (int i = low; i <= high; i++) {
			if (arr[i] <= arr[pivot]) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return j;
	}

	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pivote = actualPivot(arr, low, high);
			quickSort(arr, low, pivote - 1);
			quickSort(arr, pivote + 1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 6, 1, 7, 8, 1, 2, 4 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
}
