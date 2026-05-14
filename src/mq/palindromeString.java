package mq;//linear 

public class palindromeString {// o(n) , o(1)
	public static void main(String[] args) {
		String str = "MADAM";
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		System.out.println((str.equals(res)) ? "Palindrome" : " Not Palindrome");
	}
}
