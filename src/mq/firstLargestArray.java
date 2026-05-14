package mq;//linear search

public class firstLargestArray {// o(n) , o(1)
	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8, 25, 15 };

		int Max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > Max) {
				Max = arr[i];
			}
		}
		System.out.println("Largest element : " + Max);
	}

}
