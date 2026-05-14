package mq;

import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Map;

public class freqOfArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 3, 2, 3, 3, 4 };

		Map<Integer, Integer> m = new LinkedHashMap();
		for (int x : arr) {
			m.put(x, m.getOrDefault(x, 0) + 1);// storing into map
		}
		// Display Map Values
		System.out.println(m);
		System.out.println(m.entrySet());
		for (Entry<Integer, Integer> v : m.entrySet()) {
			System.out.println(v.getKey() + ":=:" + v.getValue());
		}
		m.forEach((k, v) -> System.out.println(k + "=" + v));
	}

}
