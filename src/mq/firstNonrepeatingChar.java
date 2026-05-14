package mq;//Frequency Array (Counting)

public class firstNonrepeatingChar {// o(n) , o(1)

	public static void main(String[] args) {

		String str = "automation";
		int[] freq = new int[256];

		// Count frequency
		for (char ch : str.toCharArray()) {
			freq[ch]++;
		}

		// Find first non-repeating
		for (char ch : str.toCharArray()) {
			if (freq[ch] == 1) {
				System.out.print(ch + " ");
			}
		}
	}
}
