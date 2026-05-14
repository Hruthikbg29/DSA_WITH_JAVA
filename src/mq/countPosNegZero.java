package mq;

public class countPosNegZero { // O(n) , 0(1)
	public static void countPNZ(int[] arr) {
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos++;
			} else if (arr[i] < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		System.out.println("Positive count : " + pos);
		System.out.println("Negative count : " + neg);
		System.out.println("Zero count : " + zero);
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 5, -3, 0, 2, 7 };
		countPNZ(arr);
	}
}
