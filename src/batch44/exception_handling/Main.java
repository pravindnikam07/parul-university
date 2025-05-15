package batch44.exception_handling;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program started!...");
		
		// Arithmatic Exception
		/*
		 
		 try{
		 	// code that can throw the exception
		 
		 }
		 catch(	Exception e) {
		 	// alternative login in case exception arises
		 }
		 
		 */
		
		
		try {
			
			int a = 5;
			float b = 0.0f;		// 0.00000000000000000000000000000000000122345
			float c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		 
		
		System.out.println("Program end!...");
	}
}
