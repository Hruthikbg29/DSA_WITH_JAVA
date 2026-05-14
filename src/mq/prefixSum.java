package mq;

import java.util.Arrays; //o(n),  o(n ) 

public class prefixSum {
	public static int[] buildPrefiXSum(int [] arr) {
		int n = arr.length;
		int prefix[] = new int[n];
		
		prefix[0] = arr[0];
		for(int i=1;i< n;i++) {
			prefix[i] = prefix[i-1]+arr[i];
		}
		return prefix;
	}
public static void main(String[] args) {
	int arr[] = {2,4,6,8,10};
	int [] prefiX = buildPrefiXSum(arr);
	System.out.println("Prefix Sum Array "+Arrays.toString(prefiX));
}
}
