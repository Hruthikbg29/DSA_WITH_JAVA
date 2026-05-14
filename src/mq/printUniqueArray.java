package mq;

import java.util.LinkedHashMap;
import java.util.Map;

public class printUniqueArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 3, 2, 3, 3, 4 ,5};

		Map<Integer, Integer> m = new LinkedHashMap();
		for(int x : arr) {
			m.put(x, m.getOrDefault(x, 0)+1);//storing into map
		}
		m.forEach((k,v)->{
			if(v==1) {
				System.out.println(k);
			}
		});
	}

}
