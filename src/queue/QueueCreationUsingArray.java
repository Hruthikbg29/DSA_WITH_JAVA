package queue;

class queuePgm {
	int[] queues;
	int boq, toq;

	public queuePgm(int size) {
		queues = new int[size];
		boq = toq = -1;
	}

	public boolean isFull() {
		return toq == queues.length - 1;
	}

	public boolean isEmpty() {
		return boq == -1 || boq == queues.length;
	}

	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else if (boq == -1) {
			boq = 0;
			queues[++toq] = value;
			System.out.println("The value is added");
		} else {
			queues[++toq] = value;
			System.out.println("The value is added");
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is already empty");
		} else {
			int value = queues[boq];
			boq++;
			if (boq > toq) {
				boq = toq = -1;
			}
			System.out.println("The retrieved value is " + value);
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Peek value is :" + queues[boq]);
		}
	}

	public void delete() {
		queues = null;
		System.out.println("Queues is deleted ");
	}
}

public class QueueCreationUsingArray {
	public static void main(String[] args) {
		queuePgm q1 = new queuePgm(6);
		System.out.println("queue is full : " + q1.isFull());
		System.out.println("queue is empty : " + q1.isEmpty());
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.enQueue(60);
		q1.deQueue();
		q1.peek();

	}
}
