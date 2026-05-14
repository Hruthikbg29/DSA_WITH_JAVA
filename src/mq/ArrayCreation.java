package mq;

class SingleDimensionArray {
	int arr[];

	public SingleDimensionArray() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insertion(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("The Value is :" + value + "is Entered");
			} else {
				System.out.println("The block is already filled");
			}
		} catch (Exception e) {
			System.out.println("Invalid index or value");
		}
	}

	public void traverese() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void Searching(int searValue) {
		try {
			for (int i = 0; i < arr.length; i++)

				if (arr[i] == searValue) {
					System.out.println("The Value is Present :" + i);
					return;
				}
			System.out.println("The block is already filled");
		} catch (Exception e) {
			System.out.println("Invalid index or value");
		}

	}

	public void Deletion(int value) {
		try {
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == value) {
					arr[i] = Integer.MIN_VALUE;
					System.out.println("The Value is Deleted");
					return;
				}
			}
			System.out.println("The block is already filled");
		} catch (Exception e) {
			System.out.println("Invalid index or value");
		}
	}
}

public class ArrayCreation {
	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray();
		sda.insertion(0, 7);
		sda.insertion(3, 1);
		sda.insertion(4, 14);
		sda.insertion(1, 9);
		sda.insertion(2, 6);
		sda.insertion(0, 10);
		sda.insertion(5, 0);

		sda.traverese();
		sda.Searching(6);
		sda.Deletion(6);
		sda.traverese();
	}
}
