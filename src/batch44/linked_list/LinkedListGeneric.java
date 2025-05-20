package batch44.linked_list;

public class LinkedListGeneric {

	

	public static void main(String[] args) {
		
		
		Node1<String> llg = new Node1<>();
		
		llg.insert("Rahul");
		llg.insert("Rakesh");
		llg.traverse();
		
		
		Node1<Integer> llgI = new Node1<>();
		llgI.insert(2);
		llgI.insert(7);
		llgI.traverse();
		
	}
	
}


class Node1<T> {
	
	Node1<String> head;
	
	T data;
	Node1<T> next;
	
	
	public Node1(){};
	
	public Node1(T data) {
		this.data = data;
		this.next = null;
	}
	
	
	public void insert(T data) {
		if(head == null) {
			Node1 newNode = new Node1(data);
			head = newNode;
		}
		else {
			Node1 curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			Node1 newNode = new Node1(data);
			curr.next = newNode;
		}
	}
	
	public void traverse() {
		Node1 curr = head;
		
		while(curr != null) {
			System.out.print(curr.data + " => ");
			curr = curr.next;
		}
		
		System.out.println("null");
	}
	
}