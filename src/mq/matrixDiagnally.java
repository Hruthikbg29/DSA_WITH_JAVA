package mq;//Diagonal Traversal (Top-Right to Bottom-Left)

public class matrixDiagnally { // O(n*m)O(1)
	public static void main(String[] args) {
		int[][] mat = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };
		int rows = mat.length;
		int cols = mat[0].length;

		for (int i = 0; i < rows + cols - 1; i++) {

			int row = (i < cols) ? 0 : i - cols + 1;
			int col = (i < cols) ? i : cols - 1;

			while (row < rows && col >= 0) {
				System.out.print(mat[row][col] + " ");
				row++;
				col--;
			}
			System.out.println();
		}
	}
}
