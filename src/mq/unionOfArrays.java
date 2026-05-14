package mq;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class unionOfArrays {
	public static void main(String[] args) {
		int[] a1 = { 1, 3, 5 };
		int a2[] = { 1, 2, 4, 5, 6 };

		Set s1 = new TreeSet();
		for (int x : a1) {
			s1.add(x);
		}
		for (int y : a2) {
			s1.add(y);
		}
		System.out.println("Result : " + s1);

	}
}
