package mq;//Counting / Frequency Array (Counting Sort idea)

public class ascendingOrder {// o(n) , o(1)
	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 1, 5, 1, 9 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] count = new int[max + 1];// size of count, count = {0,0,0,0,0,0,0,0,0,0} initial will be zero

		for (int num : arr) {
			count[num]++;
		}

		System.out.println("Ascending Order");
		for (int i = 0; i <= max; i++) {
			while (count[i] > 0) {
				System.out.print(i + " ");
				count[i]--;// Decrease frequency after printing once
			}
		}
	}
}
