package batch55.class_and_objects;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		System.out.println(Calculator.pi); // calling the class members by class name
		
		Calculator cal = new Calculator();
		System.out.println(cal.pi);			// calling the class members by object name
		System.out.println(cal.add(3, 5));	// calling the object members by object reference
		
		System.out.println(cal.add(4.3, 6.4));
	}

}
