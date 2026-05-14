package mq;//Easiest Way
import java.util.Arrays;
public class removeElements {//O(n) ,O(n)
	public static int RemoveEle(int []arr , int val) {
		int k =0;
		for(int i=0 ;i< arr.length;i++) {
			if(arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
		}
		return arr[k];
	}
	 public static void main(String[] args) {
	        int[] arr = {3, 2, 2, 3};
	        int val = 3;
	        int newLength = RemoveEle(arr, val);

	        System.out.println("New Length: " + newLength);
	        // Print the modified array up to the new length
	        System.out.print("Modified Array: ");
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(arr[i]+" " );
	        }
	        System.out.println();
//	        System.out.println(Arrays.toString(arr));
	    }
}
