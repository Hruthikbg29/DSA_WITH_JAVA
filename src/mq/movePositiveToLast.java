package mq;

import java.util.Arrays;
import java.util.Iterator;

public class movePositiveToLast {
	public static void main(String[] args) {
		int a[] = { -1, -9, 2, 3, 0, -4, 4, -3 };
		int j = 0;
		int[] temp = new int[a.length];
		for (int i = 0; i < temp.length; i++) {// storing negative first
			if (a[i] < 0) {
				temp[j++] = a[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {// storing positive second
			if (a[i] > 0) {
				temp[j++] = a[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
