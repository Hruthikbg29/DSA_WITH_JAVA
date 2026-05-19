package queue;//(Array + Modulo)


class cirQueue{ // o(1)tc , o(n) sc 
	private int[] queue;
	private int front , rear, size , capacity;
	
	
	public cirQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front =0;
		rear = -1;
		size =0;
	}
	
	public void enqueue(int x) { // o(1)
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear +1)% capacity;
		queue[rear] =x;
		size++;
		System.out.println(x+" : enqueued");
	}
	
	public void dequeue() { // o(1)
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(queue[front]+ " : dequeued");
		front = (front+1) % capacity;
		size --;
	}
	  public int front() { // o(1)
	        if (isEmpty()) return -1;
	        return queue[front];
	    }
	
	public int rear() { // o(1)
		if(isEmpty()) return-1;
		return queue[rear];
	}
	public boolean isEmpty() {
		return size ==0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
}
public class circularQueue {
public static void main(String[] args) {
	cirQueue q1 = new cirQueue(5);
	
	q1.enqueue(10);
	q1.enqueue(20);
	q1.enqueue(30);
	q1.enqueue(40);
	q1.enqueue(50);
	
	q1.dequeue();
	q1.dequeue();
	
	q1.enqueue(60);
	q1.enqueue(70);
	q1.enqueue(80);	
	System.out.println("Front Element "+ q1.front());
	System.out.println("Rear Element "+ q1.rear());
	
}
}
