package mq;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {//O(n) ,o(n)
public static void main(String[] args) {
	Integer[] arr = {1,2,3,4,2,7,8,8};
	System.out.println("given :"+Arrays.toString(arr));
	Set  s1 = new LinkedHashSet();
	
	for(int x :arr) {
		s1.add(x);
	}
	System.out.println("Res :"+s1);
	
}
}
