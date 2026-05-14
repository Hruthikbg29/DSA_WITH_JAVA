package mq;

public class reverseaString {
	public static void main(String[] args) {
		String str = "Automation";
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		System.out.println("Reversed String:=" + res);
	}
}
