package mq;

import java.util.Arrays;

public class checkforAnagrams {
public static void main(String[] args) {
	String s1 = "act";
	String s2 ="cat";
	
	if(s1.length() == s2.length()) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)){
			System.out.println("Anangram");
		}else {
			System.out.println("Not an Anangrams!!!");
		}
	}else {
		System.out.println("Not an Anangrams");
	}
}
}
