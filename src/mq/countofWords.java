package mq;

public class countofWords {//o(n)split(" ") scans the entire string once , o(1)
public static void main(String[] args) {
	String str = "Java is a Programming language";
	String [] words = str.split(" ");
	System.out.println("Number of words: " +words.length);
	
}
}
