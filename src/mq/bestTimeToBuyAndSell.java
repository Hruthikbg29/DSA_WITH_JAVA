package mq;//Best Time to Buy and Sell Stock (Single Transaction)

public class bestTimeToBuyAndSell { // o(n) , o(1)
	public static int maxProfit(int[] prices) {
		int bestBuy = prices[0];
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > bestBuy) {
				maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
			}
			bestBuy = Math.min(prices[i], bestBuy);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum Profit: " + maxProfit(prices));
	}
}
