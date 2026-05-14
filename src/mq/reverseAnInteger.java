package mq;

public class reverseAnInteger {
	public static void main(String[] args) {
		int num = 12345;
		int res = 0;
		while (num != 0) {
			int dig = num % 10;
			res = res * 10 + dig;
			num /= 10;
		}
		System.out.println("Reversed number is " + res);
	}
}
