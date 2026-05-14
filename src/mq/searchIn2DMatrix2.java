package mq;//Staircase Search (Greedy Search from Top-Right / Bottom-Left)

public class searchIn2DMatrix2 {// O(m + n) , o(1)
	public static boolean searchMat(int mat[][], int tar) {
		int m = mat.length;
		int n = mat[0].length;

		int row = 0;
		int col = n - 1;

		while (row < n && col >= 0) {
			if (tar == mat[row][col]) {
				return true;
			} else if (tar < mat[row][col]) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] mat = {
				{ 1, 4, 7, 11, 15 },
				{ 2, 5, 8, 12, 19 }, 
				{ 3, 6, 9, 16, 22 }, 
				{ 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int tar = 5;
		int ta = 31;
		System.out.println("Tar Found :" + searchMat(mat, tar));
		System.out.println("Tar Found :" + searchMat(mat, ta));
	}

}
