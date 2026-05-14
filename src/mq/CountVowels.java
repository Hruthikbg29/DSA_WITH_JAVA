 package mq;//Linear Traversal + Character Checking

public class CountVowels {// o(n),o(n)

	public static void main(String[] args) {
		String str = "Java Programming";
		int vowels = 0, consonents = 0;
		StringBuilder vowelsChar = new StringBuilder();// Use StringBuilder to store characters efficiently
		StringBuilder consonentsChar = new StringBuilder();// Store vowels and consonants characters
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
				vowelsChar.append(ch);
			} else if (ch >= 'a' && ch <= 'z') {
				consonents++;
				consonentsChar.append(ch);
			}
		}
		System.out.println("vowels count : " + vowels);
		System.out.println("Vowels are : " + vowelsChar);
		System.out.println("consonents count : " + consonents);
		System.out.println("consonents : " + consonentsChar);
	}

}
