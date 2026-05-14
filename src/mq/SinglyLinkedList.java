package mq;//Approach: Singly Linked List using Tail Pointer

class Node {
	int value;
	Node next;
}

class SingleLinkedList {
	Node head, tail;
	int size;

	public void CreationOfSLL(int value) {
		head = new Node();
		Node node = new Node();
		node.value = value;
		node.next = null;
		head = tail = node;
		size = 1;
	}

	public void insertOfSLL(int loc, int val) {
		Node node = new Node();
		node.value = val;

		if (head == null) {
			CreationOfSLL(val);
		} else if (loc == 0) {
			node.next = head;
			head = node;
		} else {
			node.next = null;
			tail.next = tail = node;
		}
		size++;
	}

	public void Traverse() {
		Node temp = head; // 00
		while (temp != null) {
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
	}

	public void search(int sVal) {
		Node temp = head; // 00
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

public class SinglyLinkedList {
	public static void main(String[] args) {
		SingleLinkedList s11 = new SingleLinkedList();
		s11.CreationOfSLL(10);

		s11.insertOfSLL(1, 20);
		s11.insertOfSLL(2, 30);
		s11.insertOfSLL(3, 40);
		s11.insertOfSLL(4, 50);
		s11.insertOfSLL(5, 60);
		s11.Traverse();
		s11.search(70);
	}
}
