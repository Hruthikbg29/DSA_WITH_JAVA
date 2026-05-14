package mq;

public class TwoSumWith2loops {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int tar = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == tar) {
//					System.out.println(arr[i] + " " + arr[j]);

					System.out.println(i + " " + j);
					System.out.println("-------");
				}
			}
		}
	}
}
