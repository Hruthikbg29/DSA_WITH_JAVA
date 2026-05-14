package mq;

import java.util.Iterator;

public class countofCharacterr {// o(n),o(1)
	public static void main(String[] args) {
		String str = "aaabaacde";

		int freq[] = new int[127];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			freq[c]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.print((char) i + ":" + freq[i] + ",");
			}
		}
	}
}
