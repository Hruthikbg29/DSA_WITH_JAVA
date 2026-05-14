package mq;

public class perfectNumOrNot {
	public static void main(String[] args) {
		int num = 6;//factors nums 
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {// y because factors lies half of that for 6 = 1,2,3;
			if (num % i == 0) {
				sum += i;
			}
		}
		System.out.println((sum==num)?"perfect num":"not perfect num");
	}
}
