package mq;//Conditional (Ternary) Operator Approach

public class findLargestof3nums {// o(1),0(1) constant
	public static void main(String[] args) {
		int a = 10, b = 25, c = 15;
		int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("The largest number is : " + largest);
	}
}
