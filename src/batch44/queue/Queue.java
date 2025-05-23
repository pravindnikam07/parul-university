package batch44.queue;

public class Queue {

	int capacity;
	int[] queue;
	int rear;
	int front;
	
	public Queue() {
		this.capacity = 16;
		this.queue = new int[this.capacity];
		this.rear = 0;
		this.front = -1;
	}
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[this.capacity];
		this.rear = 0;
		this.front = -1;
	}
	
	
	// enqueue
	public void enqueue(int data) {
		if(rear >= capacity) {
			System.out.println("Queue is full");
		}
		else {
			queue[rear] = data;
			rear++;
		}
	}
	
	
	// dequeue => removing the element from the front
	public int dequeue() {
		this.front++;
		if(this.front == this.rear) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			int frontElement = this.queue[this.front];
			this.queue[this.front] = 0;
			return frontElement;
		}
	}
	
	// peek => return the front element
	public int peek() {
		return this.queue[this.front + 1];
	}
	
	
	// isEmpty
	public boolean isEmpty() {
		return this.front + 1 == this.rear;
	}
	
	
	// isFull
	public boolean isFull() {
		return this.rear >= this.capacity;
	}
	
	
	// size
	public int size() {
		// find the size
		return rear - front  + 1;
	}
}
