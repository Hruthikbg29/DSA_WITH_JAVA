package mq;//sliding window 

public class StringPermutation {// o(n) o(1)

	public static boolean checkInclusion(String s1, String s2) {
		int n = s1.length(), m = s2.length();
		int freq[] = new int[26];

		if (n > m)
			return false;

		for (int i = 0; i < n; i++) {
			freq[s1.charAt(i) - 'a']++;
			freq[s2.charAt(i) - 'a']--;
		}

		if (zero(freq)) {
			return true;
		}
		for (int i = n; i < m; i++) {
			freq[s2.charAt(i) - 'a']--;
			freq[s2.charAt(i - n) - 'a']++;

			if (zero(freq))
				return true;
		}
		return false;

	}

	static boolean zero(int[] arr) {
		for (int x : arr) {
			if (x != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";

		System.out.println("Permutation exists :" + checkInclusion(s1, s2));
	}
}
