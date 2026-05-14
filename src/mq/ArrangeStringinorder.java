package mq;

public class ArrangeStringinorder {
	public static void main(String[] args) {
		String str = "RGBYRGBY";

		int[] freq = new int[256];

		// Count frequency of each character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			freq[c]++;
		}

		// Print characters in order of their ASCII values
		for (int i = 0; i < 256; i++) {
			while(freq[i] > 0) {
				System.out.print((char)i);
				freq[i]--;
			}
		}
	}
}
