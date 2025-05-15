package batch44.exception_handling;

import java.io.IOException;

public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Started...");
		try {
			int age = 15;
			
			if(age < 21) {
				throw new IOException("Throwing IO exception");
			}
		}
		catch (IOException ae) {
			System.out.println("inside catch block");
			System.out.println(ae.getMessage());
		}
		
		
		System.out.println("end...");
	}
}
