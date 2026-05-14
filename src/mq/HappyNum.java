package mq;

public class HappyNum {
	public static int sumation(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem * rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {// 10 = 0*0 = 0, 1*1=1 ,0+1= 1 or if it is 7 its is a happy num
		int num = 1234;// 13= 1+9 = 10 =1 same check
		while (num > 9) {
			num = sumation(num);
		}
		if (num == 1 || num == 7) {
			System.out.println("Happy num");
		} else {
			System.out.println("Not Happy Num");
		}
	}
}
