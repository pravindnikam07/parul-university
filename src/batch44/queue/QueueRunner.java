package batch44.queue;

import java.util.Arrays;

public class QueueRunner {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		System.out.println(queue.isEmpty()); 	// true
		
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(8);
		queue.enqueue(9); //4
		
		System.out.println(queue.isEmpty());	// false
		
		System.out.println(Arrays.toString(queue.queue));
		
		System.out.println(queue.dequeue());	// 3 // 3
		System.out.println(queue.dequeue());	// 5
		
		System.out.println(queue.peek()); 		// 8
		
		System.out.println(Arrays.toString(queue.queue));
		
		System.out.println(queue.isFull()); 	// false
	}
}
