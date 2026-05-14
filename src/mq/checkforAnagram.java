package mq;

public class checkforAnagram {

	static boolean checkAna(String s1, String s2) { // o(n)
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length())
			return false;

		int count[] = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++; // l= +1
			count[s2.charAt(i) - 'a']--; // l=-1
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0)
				return false; // =0

		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";

		System.out.println(checkAna(s1, s2) ? "Anagrams" : "Not Anagrams");
	}
}
