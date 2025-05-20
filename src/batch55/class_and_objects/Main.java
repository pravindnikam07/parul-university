package batch55.class_and_objects;

public class Main {

	public static void main(String[] args) {
		
		// using default constructor
		
		Employee emp1 = new Employee();
		emp1.name = "Ravikant";
		emp1.printEmployee();
		
		System.out.println("=========");
		
		Employee emp2 = new Employee();
		emp2.name = "Ankit";
		emp2.printEmployee();
		
		
		System.out.println("=========");
		
		Employee emp3 = new Employee(1, "Aman", 500000, "Tech");
		emp3.printEmployee();
		
//		emp3.salary = emp3.salary * 0.1 + emp3.salary;
		System.out.println(emp3.increamentalSalary(10));
		emp3.printEmployee();
		
	}
}
