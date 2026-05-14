package mq;

public class matrixTransposeandReverse {

	   public static void main(String[] args) {

	        int[][] mat = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int n = mat.length;

	        // STEP 1: Transpose
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = mat[i][j];
	                mat[i][j] = mat[j][i];
	                mat[j][i] = temp;
	            }
	        }

	        // STEP 2: Reverse columns (NOT rows)
	        for (int i = 0; i < n; i++) {
	            for (int j = n - 1; j >= 0; j--) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
