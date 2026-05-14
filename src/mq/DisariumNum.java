package mq;

public class DisariumNum {// based upon index like
	public static void main(String[] args) {
		int num = 135;// 5 in 3 position so 5*5*5 , 3 in 2 so 3*3 , 1 // 125+9+1 =135
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
			count--;
			ORnum /= 10;

		}
		System.out.println((Cnum == sum) ? "Disarium" : "NotDisarium");
	}
}
