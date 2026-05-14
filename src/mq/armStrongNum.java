package mq;

public class armStrongNum {
	public static void main(String[] args) {
		int num = 153;// 370 371
		int ORnum = num;
		int Cnum = num;
		int sum = 0;
		int count = 0;

		while (num != 0) {
			count++;
			num /= 10;
		}
		while (ORnum != 0) {
			int rem = ORnum % 10;
			sum += Math.pow(rem, count);
			ORnum /= 10;
		}
		System.out.println((Cnum == sum) ? "ArmStrong" : "NotArm");
	}
}
