package mq;

import java.util.Arrays;

public class removeadjacentDupicates {
	public static void main(String[] args) {
		int arr[] = { 5, 5, 4, 4, 3, 2, 1, 1, };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(arr[arr.length - 1]);
	}
}
