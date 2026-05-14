package mq;

import java.util.Arrays;

public class swappZerostoFirst {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 3, 0, 4 };
		System.out.println(Arrays.toString(arr));
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] == 0) {
				i++;
			} else if (arr[j] != 0) {
				j--;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
