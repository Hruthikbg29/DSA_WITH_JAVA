package mq;//binary-search variation

public class searchInRotatedSortedArray {//O(log n) , O(1)
public static int search(int[]nums, int tar) {
	int st = 0;
	int end = nums.length-1;
	
	while(st <= end) {
		int mid = st + (end -st)/2;
		
		if(nums[mid] == tar) {
			return mid;
		}
		if(nums[st] <= nums[mid]) {
			if(tar >= nums[st] && tar < nums[mid]) {
				end = mid-1;
			}else {
				st = mid+1;
			}
		}else {
			if(tar > nums[mid] && tar <= nums[end]) {
				st = mid+1;
			}else {
				end = mid-1;
			}
		}
		
	}
	return -1;
}
public static void main(String[] args) {
	int nums[] = {4,5,6,7,0,1,2};
	int target = 5;
	System.out.println("Target Index : "+search(nums, target));
}
}
