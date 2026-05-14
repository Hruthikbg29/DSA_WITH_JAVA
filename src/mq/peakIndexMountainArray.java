package mq;//Binary Search on Slope (Modified Binary Search)

public class peakIndexMountainArray {//O(log n) , o(1)
	public static int peakIdx(int[] arr) {
		int st = 0 ;
		int end = arr.length-1;
		
		while(st <=end) {
			int mid = st +(end -st)/2;
			if(arr[mid-1]< arr[mid] && arr[mid] > arr[mid+1]) {
				return mid;
			}
			else if(arr[mid] < arr[mid+1]) {
				st = mid+1;
			}else {
				end = mid-1;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int [] arr = {0,2,8,9,5,2};
		
		System.out.println("Peak Idx :"+peakIdx(arr));
	}
}
