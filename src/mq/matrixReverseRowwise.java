package mq;

public class matrixReverseRowwise {
	  public static void main(String[] args) {

	        int[][] mat = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        for(int i=0;i<mat.length;i++) {
	        	for(int j=mat[i].length-1;j>=0;j--) {
	        		System.out.print(mat[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	  }
}
