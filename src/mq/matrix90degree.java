package mq;

public class matrix90degree {// O(n*n)
	public static void main(String[] args) { // clock wise
		int [][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		int n = mat.length;

		for (int col = 0; col < n; col++) {
			for (int row = n - 1; row >= 0; row--) {
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();// nextline
		}
	}
}
