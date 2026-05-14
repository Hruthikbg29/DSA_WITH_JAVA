package mq;

public class matrixSpiral {// o(m*n) , o(1)
	public static void main(String[] args) {

		int[][] mat = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }		
		};

		int sRow = 0;
		int eRow = mat.length - 1;
		int sCol = 0;
		int eCol = mat[0].length - 1;

		while (sRow <= eRow && sCol <= eCol) {

			// srow
			for (int i = sCol; i <= eCol; i++) {
				System.out.print(mat[sRow][i] + " ");
			}

			// eCol
			for (int j = sRow + 1; j <= eRow; j++) {
				System.out.print(mat[j][eCol] + " ");
			}

			for (int i = eCol - 1; i >= sCol; i--) {
				if (sRow == eRow) {
					break;
				}
				System.out.print(mat[eRow][i] + " ");
			}

			for (int j = eRow - 1; j >= sRow + 1; j--) {
				if (sCol == eCol) {
					break;
				}
				System.out.print(mat[j][sCol] + " ");
			}

			sRow++;
			eRow--;
			sCol++;
			eCol--;

		}
		System.out.println();
	}

}
