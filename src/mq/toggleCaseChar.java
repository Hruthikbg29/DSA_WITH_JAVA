package mq;

public class toggleCaseChar {
	public static void main(String[] args) {
		String s = "hELLO";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				ch[i] = Character.toUpperCase(ch[i]);
			} else if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		System.out.println(ch);
	}
}
