package batch44.exception_handling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// ArrayIndexOutOfBondsException
		
		System.out.println("start...");
		Scanner input  = new Scanner(System.in);
		
		try {
			int b = input.nextInt();
			int[] arr = new int[] {1,2,3,4};
			for(int i = 0; i < 3; i++) {
				System.out.println(arr[i] / b);
			}
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmatic exception at line 20");
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(" at line 23");
		}
		catch(Exception e) {
			System.out.println("at line 26 using exception class exception handling");
		}
		finally {
			input.close();
			System.out.println("closing the scanner class");
		}
		
		
		// try with resource
//		try(Scanner input1  = new Scanner(System.in)) {
//			int b = input.nextInt();
//			int[] arr = new int[] {1,2,3,4};
//			for(int i = 0; i < 3; i++) {
//				System.out.println(arr[i] / b);
//			}
//			
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("Arithmatic exception at line 20");
//		}
//		catch(ArrayIndexOutOfBoundsException aiobe) {
//			System.out.println(" at line 23");
//		}
//		catch(Exception e) {
//			System.out.println("at line 26 using exception class exception handling");
//		
		
		
		System.out.println("End...");
	}
}
