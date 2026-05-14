package mq;

public class simpleCoins {
	public static void main(String[] args) {
		int coins = 1;
		int days = 1;

		while (coins <1000) {
			coins *= 2;
			days++;
		}
		System.out.println(days);
	}
}
