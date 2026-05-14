package mq;

import java.util.Arrays;

public class linearSearch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 3, 6, 7, 6, 8 };
		int search = 10;
//		System.out.println(Arrays.binarySearch(arr, search));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("Present In the Index : " + i);
				return;
			}
		}
		System.out.println("Their is not found : ");
	}
}
