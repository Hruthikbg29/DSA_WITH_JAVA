package mq;//Greedy Algorithm (Single Traversal)

/*
 gas[i]   → gas available at station i
cost[i]  → gas needed to go from station i to i+1
You must find one starting gas station index such that:

You can travel all stations in a circular route

Without gas ever becoming negative

If it’s not possible, return -1.*/

public class GasStation {// o(n) , o(1)
	public static int canCompCircuit(int[] gas, int[] cost) {
		int totalGas = 0;
		int totalCost = 0;

		int currGas = 0;
		int stIdx = 0;

		for (int i = 0; i < gas.length; i++) {
			totalGas += gas[i];
			totalCost += cost[i];

			currGas += gas[i] - cost[i];

			if (currGas < 0) {
				stIdx = i + 1;
				currGas = 0;
			}
		}
		if (totalGas < totalCost) {
			return -1;
		}
		return stIdx;
	}

	public static void main(String[] args) {

		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };

		System.out.println("Starting Gas Station Index : " + canCompCircuit(gas, cost));
	}
}
