package mq;

import java.util.LinkedHashMap;
import java.util.Map;

public class printDuplicatesInGivenString {
	public static void main(String[] args) {
		String str = "hi hi how r u u u ";
		String[] ch = str.split(" ");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		for (String x : ch) {
			m.put(x, m.getOrDefault(x, 0) + 1);
		}
		System.out.println(m);
		m.forEach((k, v) -> {
			if (v > 1)
				System.out.println(k);
		});
	}
}
