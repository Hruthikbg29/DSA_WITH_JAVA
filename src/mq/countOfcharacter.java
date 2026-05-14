package mq;

import java.util.LinkedHashMap;
import java.util.Map;

public class countOfcharacter {// o(n),o(1)
	public static void main(String[] args) {
		String str = "aabacdbe";
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		for (char x : ch) {
			m.put(x, m.getOrDefault(x, 0) + 1);
		}
		System.out.println(m);
		m.forEach((k, v) -> System.out.println(k + " : " + v));// lamda expression

	}
}
