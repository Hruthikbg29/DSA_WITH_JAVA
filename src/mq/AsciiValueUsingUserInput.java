package mq;
import java.util.Scanner;


public class AsciiValueUsingUserInput {
	static void print(char st , char end) {
		for(int i =st ;i<= end ;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st letter");
		char a = sc.next().charAt(0);
		System.out.println("Enter the 2nd letter");
		char b = sc.next().charAt(0);
		
		print(a, b);
	}
}
