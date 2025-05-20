package batch44.linked_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,45));
//		LinkedList<Integer> linkedList = new LinkedList<>();
		
		
		list.add(2);
		list.add(5);
		list.addLast(7);
		
		
		
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		
		
		System.out.println("========================");
		
		List<Integer> nums = new LinkedList<>(Arrays.asList(2, 5, 7, 3, 8, 4, 13));		
		
		
		// using for loop
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == 8) {
				System.out.println(3 + " is at index " + i);
				break;
			}
		}
		
		System.out.println(nums.contains(6));
		
		
		// for each loop
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		// forEach method using lambda expression
		nums.forEach(num -> System.out.print(num + " - "));
		System.out.println();
		
		nums.forEach((num) -> {
			num = num * num;
			System.out.print(num + " , ");
		});
		
		System.out.println();
		
		// forEach method using method reference
		nums.forEach(System.out::print);

	}
}


//  2, 5, 7, 3, 8, 4, 13
// search element with value 3