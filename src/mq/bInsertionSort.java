package mq;//Insertion Sort is very important for interviews, especially to 

			//explain best case O(n) and in-place sorting.

import java.util.Arrays; //o(n) , o(1)

public class bInsertionSort {
	public static void insertSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 6, 1, 3 };
		insertSort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
}
