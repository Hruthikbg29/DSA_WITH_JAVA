package patterns;

public class Butterfly {
	public static void main(String[] args) {

		// right triangle
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col <= row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("");

			// mirror right triangle
			for (int col = 5; col >= 1; col--) {
				if (col <= row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// mirror reverse right
		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= 1; col--) {
				if (col >= row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("");

			// reverse right
			for (int col = 1; col <= 5; col++) {
				if (col >= row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
