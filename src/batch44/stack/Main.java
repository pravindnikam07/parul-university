package batch44.stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// collection -> List -> vector -> Stack
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.isEmpty()); 	// true
		
		
		// push operation
		stack.add(3);
		stack.add(5);
		stack.add(6);
		stack.push(7);
		
		System.out.println(stack);				// [3, 5, 6, 7]
		
		System.out.println(stack.size());		// 4
		
		// pop operation
		int popElement = stack.pop();			// 7
		System.out.println(popElement);
		System.out.println(stack.pop());		// 6
		
		System.out.println(stack);				// [3, 5]
		
		
		// peek operation
		System.out.println(stack.peek()); 		// 5
		
		
		System.out.println(stack.isEmpty()); 	// false
		
		System.out.println(stack.size()); 		// 2
		
		
		
		
		System.out.println("==============Stack==================");
		
		// Stack is Deque Interface implemented classes
		
		LinkedList<Integer> stk = new LinkedList<>();
//		ArrayDeque<Integer> stk = new ArrayDeque<>();
		
		// push operation
		stk.add(56);
		stk.add(34);
		stk.add(23);
		stk.addLast(76);
		
		System.out.println(stk);
		
		// pop operation
		System.out.println(stk.pollLast());
		System.out.println(stk.removeLast());
		
		
		// peek operation
		System.out.println(stk.peekLast());
		
		
		
		
		
		System.out.println("==============Queue==================");
		
		ArrayDeque<String> queue = new ArrayDeque<>();
//		LinkedList<String> queue = new LinkedList<>();
		
		
		// enqueue operation
		queue.add("a");
		queue.add("b");
		queue.addLast("c");
		System.out.println(queue);
		
		
		// Dequeue
		queue.pollFirst();
		System.out.println(queue);
		queue.pop();
//		queue.removeFirst();
		
		
		// peek operation
		queue.peekFirst();
		System.out.println(queue);
			
		
		
	}

}
