package batch55.practice_problems;

public class Student {

	private int roll;
	private String name;
	private double marks;
	
	public Student() {};
	
	
	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	public double getMarks() {
		return this.marks;
	}
	
	public void setMarks(double marks, String key) {
		if(key.equals("@#321")) {
			this.marks = marks;
		}
		else {
			System.out.println("You are not authorise to update the marks...");
		}
	}
	

	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
