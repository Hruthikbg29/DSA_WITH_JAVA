package mq;

import java.util.Arrays;

public class SortanArray { // O(nlogn)
	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 9 };
		Arrays.sort(arr);
		// normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("output is : " + arr[i]);
		}
		// Inbuilt way of printing
		System.out.println("sorted array " + Arrays.toString(arr));
		// for each loop
		for (int x : arr) {
			System.out.println("output is :" + x);
		}
	}
}
