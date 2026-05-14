package mq;//HashSet Duplicate Detection + Range Scan

import java.util.HashSet;

public class findMissingAndRepeatedInGrid {// O(n²) ,O(n²)

	public static int[] findMissAndRepa(int[][] grid) {
		int n = grid.length;
		int a = 0, b = 0;
		int expSum = 0;
		int actualSum = 0;
		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				actualSum += grid[i][j];

				if (s.contains(grid[i][j])) {
					a = grid[i][j]; // repeated found
				}
				s.add(grid[i][j]);
			}
		}

		expSum = (n * n) * (n * n + 1) / 2;// Correct expected sum of 1 to n^2
		b = expSum - actualSum + a;

		return new int[] { a, b };
	}

	public static void main(String[] args) {
		int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };

		int[] result = findMissAndRepa(grid);
		System.out.println("Repeated: " + result[0]);
		System.out.println("Missing : " + result[1]);
	}

}
