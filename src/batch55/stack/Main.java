package batch55.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack); 	// []
		
		
		// push operation
		stack.push(45);				// [45]
		stack.push(4);				// [45, 4]
		stack.push(54);				// [45, 4, 54]
		stack.push(99);				// [45, 4, 54, 99]
		
		System.out.println(stack);	// [45, 4, 54, 99]
		
		// pop operation
		int lastElement = stack.pop();
		System.out.println(lastElement); 	// 99
		
		System.out.println(stack);			// [45, 4, 54]
		System.out.println(stack.pop());	// 54
		System.out.println(stack); 			// [45, 4]
		
		
		// peek operation
		int peekElement = stack.peek();
		System.out.println(peekElement); 	// 4
		
		System.out.println(stack); 			// [45, 4]
	}
}
