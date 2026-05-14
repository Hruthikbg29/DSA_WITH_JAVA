package mq;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupStringUsingCll {
	public static void main(String[] args) {
		String str = "aaabacbdbe";
		System.out.println(str);
		char[] ch = str.toCharArray();
		Set s = new LinkedHashSet();
		for (char c : ch) {
			s.add(c);
		}
		System.out.println(s);
	}
}
