package mq;

class Node3 {
	int value;
	Node3 prev, next;
}

class CDLL {
	Node3 head, tail;
	int size;

	public void createCDLL(int val) {
		head = new Node3();
		Node3 node = new Node3();
		node.value = val;
		node.prev = node.next = node;
		head = tail = node;
		size = 1;
	}

	public void insertCDLL(int loc, int val) {
		Node3 node = new Node3();
		node.value = val;
		if (head == null) {
			createCDLL(val);
		} else if (loc == 0) {
			node.next = head;
			node.prev = tail;
			head.prev = node;
			tail.next = node;
			head = node;
		} else {
			node.prev = tail;
			node.next = head;
			tail.next = node;
			head.prev = node;
			tail = node;
		}
		size++;
	}

	public void Traverse() {
		if (head == null)
			return;
		Node3 temp = head;
		do {
			System.out.println(temp.value + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	public void search(int sVal) {
		Node3 temp = head; // 00
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

public class circularDoubllyLinkedList {
	public static void main(String[] args) {
		CDLL d1 = new CDLL();
		d1.createCDLL(5);
		d1.insertCDLL(1, 20);
		d1.insertCDLL(2, 30);
		d1.insertCDLL(3, 40);
		d1.insertCDLL(4, 50);
		d1.Traverse();
		d1.search(40);
	}
}
