package mq;

public class removeDupString {// o(n),o(1)
	public static void main(String[] args) {
		String Str = "programming";
		boolean[] seen = new boolean[256];
		String res = "";
		char[] c = Str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (!seen[c[i]]) {
				res += c[i];
				seen[c[i]] = true;
			}
		}
		System.out.println(res);

	}
}
