package mq;

public class matrixTransposeRowwise {
	public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = mat.length;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(mat[j][i]+" ");
        	}
        	System.out.println();
        }
	}
}
