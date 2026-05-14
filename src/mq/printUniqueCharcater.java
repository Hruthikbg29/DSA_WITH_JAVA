package mq;

import java.util.LinkedHashMap;
import java.util.Map;

public class printUniqueCharcater {
public static void main(String[] args) {
	String str = "aabbccdeefgrb";
	char[] ch = str.toCharArray();
	Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

	for (char x : ch) {
		m.put(x, m.getOrDefault(x, 0) + 1);
	}
	System.out.println(m);
	m.forEach((k, v) -> {
		if (v == 1)
			System.out.println(k+":"+v);
	});
}
}
