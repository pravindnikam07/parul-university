package batch55.class_and_objects;

public class Employee {

	int empId;
	String  name;
	double salary;
	String department;
	
	public Employee() {}
	
	public Employee(int empId, String name, double salary, String dept) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = dept;
	}
	
	public void printEmployee() {
		System.out.println(this.empId);
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.department);
	}
	
	
	public double increamentalSalary(int increamentPercent) {
		this.salary = (this.salary * (increamentPercent / 100)) + this.salary;
		System.out.println((this.salary * (increamentPercent / 100)) + this.salary);
		return this.salary;
	}
	
}
