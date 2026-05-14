package mq;

class Node2 {
	int value;
	Node2 prev, next;
}

class DLl {
	Node2 head, tail;
	int size;

	public void createDll(int val) {
		head = new Node2();
		Node2 node = new Node2();
		node.value = val;
		node.prev = node.next = null;
		head = tail = node;
		size = 1;
	}

	public void insertDll(int loc, int val) {
		Node2 node = new Node2();
		node.value = val;
		if (head == null) {
			createDll(val);
		} else if (loc == 0) {
			node.next = head;
			node.prev = null;
			head.prev = node;
			head = node;
		} else {
			node.next = null;
			node.prev = tail;
			tail.next = node;
			tail = node;
		}

	}

	public void Traverse() {
		Node2 temp = head; // 00
		while (temp != null) {
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
	}

	public void search(int sVal) {
		Node2 temp = head; // 00
		while (temp != null) {
			if (temp.value == sVal) {
				System.out.println("\n Value is  present");
				return;
			}
			temp = temp.next;
		}
		System.out.println("value is not present");
	}

	public void delete() {
		head = tail = null;
	}
}

public class DoubllyLinkedList {
	public static void main(String[] args) {
		DLl d1 = new DLl();
		d1.createDll(5);
		d1.insertDll(1, 20);
		d1.insertDll(2, 30);
		d1.insertDll(3, 40);
		d1.insertDll(4, 50);
		d1.Traverse();
		d1.search(40);

	}
}
