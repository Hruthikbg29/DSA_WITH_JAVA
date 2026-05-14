package mq;

class Nodee {
	int val;
	Nodee next;
}

class CLL {
	Nodee head, tail;
	int size;

	public void CreationCSLL(int val) {
		head = new Nodee();
		Nodee node = new Nodee();
		node.val = val;
		node.next = node;
		head = tail = node;
		size = 1;
	}

	public void insertOfCSll(int loc, int val) {
		Nodee node = new Nodee();
		node.val = val;
		if (head == null) {
			CreationCSLL(val);
		} else if (loc == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		} else {
			node.next = head;
			tail.next = node;
			tail = node;

		}
		size++;
	}

	public void Traverse() {
		if (head == null)
			return;
		Nodee temp = head;
		do {
			System.out.println(temp.val + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	public void search(int sVal) {
		if (head == null)
			return;

		Nodee temp = head;
		do {
			if (temp.val == sVal) {
				System.out.println("Value is present");
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("value is not present");
	}

	public void delete() {
		head = tail = null;
	}
}

public class circularSinglyLinkedList {
	public static void main(String[] args) {
		CLL s1 = new CLL();
		s1.CreationCSLL(10);
		s1.insertOfCSll(1, 20);
		s1.insertOfCSll(2, 30);
		s1.insertOfCSll(3, 40);
		s1.insertOfCSll(4, 50);
		s1.insertOfCSll(5, 60);
		s1.Traverse();
		s1.search(70);
	}
}
