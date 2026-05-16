package patterns;

public class diamond {
	public static void main(String[] args) {
		//triangle
		for (int row = 1; row <=5; row++) {
			for (int col = 5; col >=1; col--) {
				if(col <=row) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//reverse triangle
		for (int row = 1; row <=5; row++) {
			for (int col = 1; col <=5; col++) {
				if(col >=row) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
