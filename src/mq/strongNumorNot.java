package mq;

public class strongNumorNot {
	public static int fact(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num = 145;// 40585;
		int sum = 0;
		int cSum = num;
		while (num != 0) {
			int rem = num % 10;
			sum += fact(rem);
			num /= 10;
		}
		System.out.println((cSum == sum) ? "strong" : "not strong");
	}
}
