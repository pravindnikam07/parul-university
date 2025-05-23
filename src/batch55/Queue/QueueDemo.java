package batch55.Queue;

import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
//		LinkedList<Integer> queue = new LinkedList<>();
		
		System.out.println(queue.isEmpty()); 	// true
			
		// Enqueue
		
		queue.addLast(4);
		queue.addLast(6);
		queue.addLast(1);
		queue.addLast(9);
		
		
		System.out.println(queue);			// [4, 6, 1, 9]
		
		// Dequeue
		System.out.println(queue.removeFirst());	// 4
		System.out.println(queue.pollFirst());      // 6
		
		System.out.println(queue);			// [1, 9]
		
		
		// peek
		
		System.out.println(queue.peekFirst()); 		// 1
		
		System.out.println(queue);			// [1, 9]
		
		System.out.println(queue.isEmpty()); 	// false
 
	}

}
