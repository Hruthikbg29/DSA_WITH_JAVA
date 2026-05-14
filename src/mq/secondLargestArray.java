package mq;


public class secondLargestArray {//o(n)
	public static void main(String[] args) {

	int []arr = {10,5,20,8,25,15};
	
	int first = Integer.MIN_VALUE; //-2147
	int second = Integer.MIN_VALUE; //-2147
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i] >first) {
			second = first;
			first = arr[i];
		}else if(arr[i] > second && arr[i] != first) {
			second = arr[i];
		}
	}
	System.out.println("Second value is : " +first);
	System.out.println("Second value is : " +second);
}
}
