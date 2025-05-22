package batch44.stack;

import java.util.Arrays;

public class StackRunner {

	public static void main(String[] args) {
		
		Stack stk = new Stack();
		
		System.out.println(stk.size); 		// 100
		
		System.out.println(stk.isEmpty()); 	// true
		
		stk.push(3);
		stk.push(5);
		
		System.out.println(stk.isEmpty());	// false
		
		System.out.println(stk.size()); 	// 2
		
		System.out.println(Arrays.toString(stk.stack));
		
		System.out.println(stk.peek());		// 5
		System.out.println(stk.pop()); 		// 5
		
		System.out.println(stk.peek());		// 3
		System.out.println(stk.pop());		// 3
		
		System.out.println(stk.peek());		// stack is underflow
		
		System.out.println(stk.pop());		// stack is underflow
		
		System.out.println(Arrays.toString(stk.stack));
		
		
		
		Stack stk1 = new Stack(500);
		System.out.println(stk1.size);
		System.out.println(Arrays.toString(stk1.stack));
	}

}
