package mq;

class TDA {
	int[][] arr;

	public TDA(int rsize, int csize) {
		arr = new int[rsize][csize];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	public void insertion(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("The Value is : " + value + " : is Entered");
			} else {
				System.out.println("The block is already filled");
			}
		} catch (Exception e) {
			System.out.println("Invalid index or value");
		}
	}

	public void traverese() {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.println(arr[row][col]);
			}
		}
	}

	public void Search(int Svalue) {
		try {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr.length; col++) {
					if (arr[row][col] == Svalue) {
						System.out.println("The value is present in index : " + row + " ," + col);
						return;
					}
				}
			}
			System.out.println("The value is not present");

		} catch (Exception e) {
			System.out.println("Invalid Index or value");
		}
	}

	public void Delete(int value) {
		try {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr.length; col++) {
					if (arr[row][col] == value) {
						arr[row][col] = Integer.MIN_VALUE;
						System.out.println("The value is deleted");
						return;

					} else {
						System.out.println("The value is not present");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Index or value");
		}
	}

}

public class TwoDArrays {
	public static void main(String[] args) {
		TDA t1 = new TDA(4, 4);

		t1.insertion(0, 0, 1);
		t1.insertion(0, 1, 2);
		t1.insertion(0, 2, 3);
		t1.insertion(0, 3, 4);

		t1.insertion(1, 0, 5);
		t1.insertion(1, 1, 6);
		t1.insertion(1, 2, 7);
		t1.insertion(1, 3, 8);

		t1.insertion(2, 0, 9);
		t1.insertion(2, 1, 10);
		t1.insertion(2, 2, 11);
		t1.insertion(2, 3, 12);

		t1.insertion(3, 0, 13);
		t1.insertion(3, 1, 14);
		t1.insertion(3, 2, 15);
		t1.insertion(3, 3, 16);

		t1.traverese();
//	
		t1.Search(15);
		
		t1.Delete(12);
		
		t1.traverese();

	}
}
