package queue;//Optimized Approach (Queue + Frequency Array)

import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingCharacterInStream {// O(n) ,O(n)
	public static void firstNonRepeating(String stream) {

		int[] freq = new int[26];
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < stream.length(); i++) {
			char ch = stream.charAt(i);

			freq[ch - 'a']++;

			queue.offer(ch);

			while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
				queue.poll();
			}
			if (queue.isEmpty()) {
				System.out.print("#,");
			} else {
				System.out.print(queue.peek() + ",");
			}
		}
	}

	public static void main(String[] args) {
		String stream = "aabc";
		System.out.println("OutPut");
		firstNonRepeating(stream);
	}
}
