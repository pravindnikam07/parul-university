package batch44.exception_handling;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		// Number format exception
		
		System.out.println("program started....");
		String s = "a";
		
		try {
			int i = Integer.valueOf(s);
			System.out.println(i);
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println(nfe.getMessage());
		}
		
		
		System.out.println("program ended");
	}
}
