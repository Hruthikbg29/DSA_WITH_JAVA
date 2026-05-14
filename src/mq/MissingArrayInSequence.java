package mq;

import java.util.ArrayList;

public class MissingArrayInSequence {
	public static void main(String[] args) {
		int a[] = {1,4,8,10,12};
		ArrayList l = new ArrayList();
		for(int x :a) {
			l.add(x);
		}
		for(int i=a[0]; i<a[a.length-1];i++) {
			if(!l.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
