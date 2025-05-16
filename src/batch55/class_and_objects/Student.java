package batch55.class_and_objects;

public class Student {
	// class => class is a blueprint to create a real world entity.
	// object => object is a real world entity.

	// properties
	int roll;
	String name;
	double marks;
	
	// default constructor
	public Student() {
		
	}
	
	// parameterized constructor
	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}
	
	
	// Behavior
	public void studentInTheClass() {
		System.out.println(this.name + " is a student in the batch 55");
	}
	
	public void studentWithFriends() {
		System.out.println(this.name + " is acting as friends outside the class");
	}
}
