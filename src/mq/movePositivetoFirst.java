package mq;//Two-Pass Stable Partition Approach

import java.util.Arrays;

public class movePositivetoFirst {// O(n) + O(n) = O(n) , O(n) extra array
	public static void main(String[] args) {
		int a[] = { -1, -9, 2, 3, -4, 4, -3 };
		int j = 0;
		int[] temp = new int[a.length];

		for (int i = 0; i < temp.length; i++) {// storing positive second
			if (a[i] > 0) {
				temp[j++] = a[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {// storing negative first
			if (a[i] < 0) {
				temp[j++] = a[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
