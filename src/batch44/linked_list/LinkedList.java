package batch44.linked_list;

public class LinkedList {

	Node head;
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
//		
		list.insert(4);
		list.insert(5);
		list.insert(7);
		
		list.traverse();
		
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteFirst();
		list.deleteFirst();
		list.traverse();
		
		
		
		// WAP to find the specific value in linked list
		int target = 34;
		
		LinkedList ll = new LinkedList();
		
		ll.insert(4);
		ll.insert(23);
		ll.insert(34);
		ll.insert(53);
		ll.insert(77);
		
		
		ll.traverse();
		
		
		 Node curr = ll.head;
		 boolean flag = true;
		 int position = 0;
		 
		 while(curr != null) {
			 
			 if(curr.data == target) {
				 System.out.println(target + " is found " + position);
				 flag = false;
				 break;
			 }
			 position++;
			 curr = curr.next;
		 }
		
		if(flag) {
			System.out.println(target + " is not found");
		}
		
		
		
		
	}
	
	
	public void insert(int data) {
		if(head == null) {
			Node newNode = new Node(data);
			head = newNode;
		}
		else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			Node newNode = new Node(data);
			curr.next = newNode;
		}
	}
	
	
	public void traverse() {
		Node curr = head;
		
		while(curr != null) {
			System.out.print(curr.data + " => ");
			curr = curr.next;
		}
		
		System.out.println("null");
	}
	
	
	public void deleteFirst() {
		if(head == null)
			return;
		head = head.next;
	}
	
	public void deleteLast() {
		
		Node curr = head;
		
		if(head == null || head.next == null) {
			head = null;
			return;
		}
		
		while(curr.next.next != null) {
			curr = curr.next;
		}
		
		curr.next = null;
	}
}


class Node {
	
	int data;
	Node next;
	
	public Node() {}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}







