package mq;

public class toggleCasewithoutInbuilt {
	public static void main(String[] args) {
		String str = "hElLO";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			} else {
				ch = (char) (ch - 32);

			}
			res += ch;
		}
		System.out.println(res);
	}
}
