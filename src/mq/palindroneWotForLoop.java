package mq;

public class palindroneWotForLoop {
	public static void main(String[] args) {
		String str = "level";
		char ch[] = str.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			if (ch[i] != ch[j]) {
				System.out.println("the string is not palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("The String is a palindrome");

	}
}
