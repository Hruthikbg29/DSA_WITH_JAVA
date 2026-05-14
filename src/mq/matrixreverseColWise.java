package mq;

public class matrixreverseColWise {// O(n*n)
	public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
        
		for (int j = 0; j < mat[0].length; j++) {
			for (int i = mat.length - 1; i >= 0; i--) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
