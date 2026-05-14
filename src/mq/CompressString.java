package mq;

public class CompressString {// o(n),o(1)
	public static void main(String[] args) {
		String str = "aaabbccccccccccc";
		String res = "";

		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				res = res + str.charAt(i) + count;
				count = 1;
			}
		}
		System.out.println(res);
	}
}
