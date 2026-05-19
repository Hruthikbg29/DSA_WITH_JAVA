package queue;//HashMap + Doubly Linked List)
import java.util.HashMap;


public class LRUCACHE{//O(1) , O(capacity)
	
	class Node{
		int key , val;
		Node prev , next;
		
		Node(int k, int v){
			key = k;
			val = v;
		}
	}
	private int capacity;
	private HashMap<Integer, Node>map;
	private Node head, tail;
	
	public  LRUCACHE(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
		
		head = new Node(0,0);
		tail = new Node(0,0);
		
		head.next = tail ;
		tail.prev = head;
	}
	
	public int get(int key) {//O(1)
		if(!map.containsKey(key)) {
			return -1;
		}
		Node node = map.get(key);
		remove(node);
		insertAtFront(node);
		
		return node.val;
	}
	public void put(int key , int value) {//O(1)
		if(map.containsKey(key)) {
			remove(map.get(key));
		}
		if(map.size() == capacity) {
			Node lru = tail.prev;
			remove(lru);
			map.remove(lru.key);
		}
		
		Node newNode = new Node(key , value);
		insertAtFront(newNode);
		 map.put(key, newNode);
	}
		private void remove(Node node) {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		
		private void insertAtFront(Node node) {
			node.next = head.next;
			node.prev = head;
			head.next.prev = node;
			head.next = node;
		
	}


public static void main(String[] args) {
	LRUCACHE cache = new LRUCACHE(2);
	
	  cache.put(1, 10);
      cache.put(2, 20);
      System.out.println(cache.get(1)); // 10
      cache.put(3, 30); // removes key 2
      
      System.out.println(cache.get(2)); // -1

      cache.put(4, 40); // removes key 1

      System.out.println(cache.get(1)); // -1
      System.out.println(cache.get(3)); // 30
      System.out.println(cache.get(4)); // 40
}
}
