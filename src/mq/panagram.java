package mq;

import java.util.LinkedHashSet;
import java.util.Set;

public class panagram {
	public static void main(String[] args) {
		String str = "the quick brown foex jumps over the lazy dog";
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Set s = new LinkedHashSet();// TreeSet();
		for (char x : ch) {
			s.add(x);
		}
		System.out.println(s);// if you need to print in sorted order we go for treeSet instead of
								// linkedhashSet
		System.out.println(s.size());
		System.out.println((s.size() == 26) ? "Panagram" : "Not Panagram");
	}
}
