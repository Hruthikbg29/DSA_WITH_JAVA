package mq;

public class arraypalindrome {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 1 };
		for (int i = 0; i < arr.length / 2; i++) {// why because j index will fetsch from last so if we traverse int
													// print everything
			if (arr[i] != arr[arr.length - 1 - i]) { // -i to decrement evey iteration
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Is a Palindrome:");
	}
}
