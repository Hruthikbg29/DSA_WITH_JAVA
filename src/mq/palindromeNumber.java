package mq;

public class palindromeNumber {
	public static void main(String[] args) {
		int num = 12321;
		int copy = num;
		int rev = 0;
		while (num != 0) {
			int dig = num % 10;
			rev = rev * 10 + dig;
			num /= 10;
		}
		System.out.println((rev == copy)?"Palindrome":"Not palindrome");
	}
}
