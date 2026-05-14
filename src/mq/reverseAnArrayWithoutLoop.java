package mq;

import java.util.Arrays;//o(n) , O(1)

public class reverseAnArrayWithoutLoop {
	
	 static void reverse(int[] arr, int i, int j) {
	        // Base case
	        if (i >= j) {
	            return;
	        }

	        // Swap elements
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;

	        // Recursive call
	        reverse(arr, i + 1, j - 1);
	    }
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};

	        reverse(arr, 0, arr.length - 1);
	        System.out.println(Arrays.toString(arr));
	    }
}




