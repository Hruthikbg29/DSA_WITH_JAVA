package mq;

public class reverseAndSubstring {// o(n),o(1)
	public static String reverse(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "MethodOverloading";
		String part1 = str.substring(0, 6);
		String part2 = str.substring(6);

		String rev = reverse(part1);
		String re1 = reverse(part2);
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(rev + part2);
		System.out.println(part1 + re1);
	}
}
