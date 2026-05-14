package mq;

import java.util.Arrays;

public class merge2unSortedArray {
	public static void main(String[] args) {
		int a1 [] = {5,6,2};
		int a2[] =  {1,3,4};
		int a3[] = {5,8,9};
		int temp[] = new int[a1.length+a2.length+a3.length];
		int j=0;
		
		for (int i = 0; i < a1.length; i++) {
			temp[j] = a1[i];
			j++;
		}

		for (int i = 0; i < a2.length; i++) {
			temp[j++] = a2[i];	
		}
		for (int i = 0; i < a3.length; i++) {
			temp[j++] = a3[i];	
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
	}
}
