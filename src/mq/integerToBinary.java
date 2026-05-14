package mq;

public class integerToBinary {
	public static void main(String[] args) {
		int num = 8;
		String res = "";
		while (num != 0) {
			int rem = num % 2;
			res = rem + res;
			num /= 2;
		}
		System.out.println(res);
	}
}
