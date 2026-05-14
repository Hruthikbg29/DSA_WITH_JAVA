package mq;//O(n²)

public class matrixRowsEqualAndColEqual {
	public static int countUniform(String s) {

        int len = s.length();
        System.out.println("String length is : "+s.length());
        int n = (int) Math.sqrt(len);
        int count = 0;

        // Check rows
        for (int i = 0; i < n; i++) {
            boolean same = true;
            char ch = s.charAt(i * n);

            for (int j = 1; j < n; j++) {
                if (s.charAt(i * n + j) != ch) {
                    same = false;
                    break;
                }
            }
            if (same) count++;
           
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            boolean same = true;
            char ch = s.charAt(j);

            for (int i = 1; i < n; i++) {
                if (s.charAt(i * n + j) != ch) {
                    same = false;
                    break;
                }
            }
            if (same) count++;
        }
        System.out.println("the count is:");

        return count;
    }
	public static void main(String[] args) {
		  System.out.println(countUniform("aaaabbbcc")); // 1
	        System.out.println(countUniform("ccee")); 
	        
	}
}
