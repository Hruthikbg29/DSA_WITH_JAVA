package mq;//Binary Search by Treating 2D Matrix as 1D Array

public class SearchIn2DMatrix {// O(log(m × n))

	public static boolean searchInRow(int mat[][], int tar, int row) {
		int n = mat[0].length;
		int st = 0, end = n - 1;

		while (st <= end) {
			int mid = st + (end - st) / 2;
			if (tar == mat[row][mid]) {
				return true;
			} else if (tar > mat[row][mid]) {
				st = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

	public static boolean searchMat(int[][] mat, int tar) {
		int m = mat.length;
		int n = mat[0].length;

		int stRow = 0;
		int endRow = m - 1;

		while (stRow <= endRow) {
			int midRow = stRow + (endRow - stRow) / 2;

			if (tar > mat[midRow][0] && tar <= mat[midRow][n - 1]) {
				return searchInRow(mat, tar, midRow);
			} else if (tar >= mat[midRow][n - 1]) {
				stRow = midRow + 1;
			} else {
				endRow = midRow - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int tar = 7;
		int ta = 8;
		System.out.println("Target found: " + searchMat(mat, tar));
		System.out.println("Target found: " + searchMat(mat, ta));
	}
}
