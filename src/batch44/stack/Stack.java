package batch44.stack;

public class Stack {

	int size;
	int[] stack;
	int top = -1;
	
	public Stack() {
		this.size = 100;
		this.stack = new int[size];
	}
	
	public Stack(int size) {
		this.size = size;
		this.stack = new int[size];
	}
	
	
	// push
	public void push(int data) {
		if(top >= size) {
			System.out.println("Stack is overflow");
		}
		else {
			top++;
			stack[top] = data;
		}
		
	}
	
	
	// pop
	public int pop() {
		if(top < 0) {
			System.out.println("Stack is underflow");
			return 0;
		}
		else {
			
			int lastElement = stack[top];
			stack[top] = 0;
			top--;
			
			return lastElement;
		}
	}
	
	
	// peek
	public int peek() {
		if(top < 0) {
			System.out.println("Stack is underflow");
			return 0;
		}
		else {
			return stack[top];
		}
	}
	
	
	// isEmpty
	public boolean isEmpty() {
//		if(top < 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		return top < 0 ? true : false;
	}
	
	
	// size
	public int size() {
		return top + 1;
	}
	
}
