package mq;

public class ExpandString {// o(n), o(n)
	public static void main(String[] args) {
		String str = "a14b2c20";
		StringBuilder result = new StringBuilder(); // Mutable!

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			i++;
			String numStr = "";
			while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numStr += str.charAt(i);
				i++;
			}
			int count = Integer.parseInt(numStr);// from digits to integer
			// Optimized: Append in bulk
			for (int j = 0; j < count; j++) {
				result.append(letter); // O(1) amortized!
			}
			i--;
		}

		System.out.println(result);
	}
}