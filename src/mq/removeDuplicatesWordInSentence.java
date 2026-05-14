package mq;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicatesWordInSentence {
	public static void main(String[] args) {
		String str = "hi hi hello how r r r u u u ";
		System.out.println(str);
		String [] ch = str.split(" ");
		Set s = new LinkedHashSet();
		for(String c : ch) {
			s.add(c);
		}
		System.out.println(s);
	}
}
