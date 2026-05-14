package mq;

import java.util.Arrays;

public class mergeSortedArrayfrom2UnsortedArray {
	public static void main(String[] args) {
		int a1[] = {5,6,1,2};
		int a2[] = {4,3,9};
		int a3[] = {10,7 ,8};
		int temp[] = new int[a1.length+a2.length+a3.length];
		//System.arraycopy(Object src, Src index, dest src, dest indx, src length);
		System.arraycopy(a1, 0, temp, 0, a1.length);
		System.arraycopy(a2, 0, temp, a1.length, a2.length);
		System.arraycopy(a3, 0, temp, a1.length+a2.length, a3.length);
		
		System.out.println(Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println("Sorted Array is :"+Arrays.toString(temp));
	}
}
