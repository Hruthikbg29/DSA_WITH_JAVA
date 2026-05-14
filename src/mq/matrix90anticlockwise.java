package mq;

public class matrix90anticlockwise { // O(n*n)
	public static void main(String[] args) {

		int[][] mat = {
		        {1, 2, 3},
		        {4, 5, 6},
		        {7, 8, 9}
		    };
		int n = mat.length;

		for (int col = n - 1; col >= 0; col--) {
			for (int row = n - 1; row >= 0; row--) {
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}
	}
}
