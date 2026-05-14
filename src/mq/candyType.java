package mq;

import java.util.HashSet;
import java.util.Set;

public class candyType {
public static  int DistCandies(int [] candyType) {
	Set<Integer> set = new HashSet<>();
	
	for(int candy : candyType) {
		set.add(candy);
	}
	
	int maxEat = candyType.length / 2;
	
	return Math.min(set.size(), maxEat);
}
public static void main(String[] args) {
	int arr[] = {1,1,2,2,3,3,3,3,5,5};
	System.out.println( "maximum he can eat :"+DistCandies(arr));
}
}
