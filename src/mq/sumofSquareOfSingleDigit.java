package mq;

public class sumofSquareOfSingleDigit {
	public static int sumation(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem * rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 1234;
		while (num > 9) {
			num = sumation(num);
		}
		System.out.println("Single Digit Num is :" + num);
	}
}
