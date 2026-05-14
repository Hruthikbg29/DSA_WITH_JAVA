package mq;

import java.util.Scanner;

public class substr {
public static void main(String[] args) {
	String str = "methodoverloading";
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter first index");
	int st = s.nextInt();
	System.out.println("enter second index");
	int end = s.nextInt();
	
	System.out.println("substring is :"+str.substring(st, end));

}
}
