package batch55.strings;

public class PrintEvenAndOddIndexString {

	public static void main(String[] args) {
		String s = "abcdfeg";
		
		// WAP to print odd index elements
		
		for(int index = 0; index < s.length(); index++) {
			if(index % 2 != 0) {
				System.out.print(s.charAt(index));
			}
		}
		
		System.out.println();
		
		
		// WAP to print even index elements
		
		for(int index = 0; index < s.length(); index++) {
			if(index % 2 == 0) {
				System.out.print(s.charAt(index));
			}
		}
		
	}
}
