package mq;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		k = k % arr.length;
		for (int i = 0; i < k; i++) {
			int f = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = f;
		}
		System.out.println(Arrays.toString(arr));
	}

}
