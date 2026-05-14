package mq;

public class matrixColWise {// O(n*n)
	public static void main(String[] args) {		
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };    
        int n = mat.length;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
} 
