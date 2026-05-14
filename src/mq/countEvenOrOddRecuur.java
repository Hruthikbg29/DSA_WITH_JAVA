package mq; // recurssive approach 

public class countEvenOrOddRecuur {// o(n) , o(1)
	static int evenCount = 0;
	static int oddCount = 0;

	public static void countEven(int arr[], int indx) {
		if (indx == arr.length) {
			return;
		}
		if (arr[indx] % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		countEven(arr, indx + 1);
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		countEven(num, 0);
		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
	}
}
