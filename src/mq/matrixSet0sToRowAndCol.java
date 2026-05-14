package mq;

import java.util.Iterator;

public class matrixSet0sToRowAndCol {
	public static void setZeroes(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;

		boolean firstColzero = false;

		// step 1 mark row and cols
		for (int i = 0; i < rows; i++) {
			if (mat[i][0] == 0) {
				firstColzero = true;
			}
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 0) {
					mat[i][0] = 0;// mark row
					mat[0][j] = 0;// mark column
				}

			}
		}
		
		// step2 set zeroes based on markers
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (mat[i][0] == 0 || mat[0][j] == 0) {
					mat[i][j] = 0;
				}

			}

		}
		// step 3 : handle first row
		if (mat[0][0] == 0) {
			for (int j = 0; j < cols; j++) {
				mat[0][j] = 0;
			}
		}
		// step 4 handle first col
		if (firstColzero) {
			for (int i = 0; i < rows; i++) {
				mat[i][0] = 0;
			}
		}
	}

	// print matrix
	public static void printMat(int[][] mat) {
		for (int[] row : mat) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 },
						{ 5, 0, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 0, 14, 15, 16 } 
					};
		System.out.println("Before");
		printMat(mat);

		setZeroes(mat);
		System.out.println("\nAfter");
		printMat(mat);
	}

}
