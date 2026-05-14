
package mq;//Counting / Frequency Array (Counting Sort idea)

public class descendingOrder {// o(n) ,o(1)
	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 1, 9, 5, 2 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] count = new int[max + 1];

		for (int num : arr) {
			count[num]++;
		}

		System.out.println("Descending order");
		for (int i = max; i >= 0; i--) {
			while (count[i] > 0) {
				System.out.print(i + ",");
				count[i]--;
			}
		}
	}
}
