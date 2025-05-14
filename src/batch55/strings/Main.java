package batch55.strings;

public class Main {
	public static void main(String[] args) {
		// String in java
		
		
//		String name = "Raj";	// string literal
//		String name1 = new String("Raj"); // new keyword and String constructor
//		System.out.println(name);
//		System.out.println(name1);
		
		
		
//		String s1 = "abc";
//		String s2 = "abc";
//		
//		String s3 = new String("abc");
//		String s4 = new String("abc");
//		
//		System.out.println(s1 == s2); 	// output => true
//		System.out.println(s1 == s3); 	// output => false
//		System.out.println(s2 == s3);	// output => false
//		System.out.println(s3 == s4);	// output => false
//		System.out.println(s1.equals(s3)); 	// true
//		
//		
		
		
		
		// Strings are immutable in nature
		
		// Iterate over string
		
//		String s = "abcd";
		
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(1));
//		System.out.println(s.charAt(2));
//		System.out.println(s.charAt(3));
		
		// for loop
//		System.out.println("Using for loop");
//		for(int i = 0; i < s.length(); i++) {
//			System.out.print(s.charAt(i) + " ");
//		}
//		
//		System.out.println();
//		
//		
//		System.out.println("Using while loop");
//		// while loop
//		int index = 0;
//		while(index < s.length()) {
//			System.out.print(s.charAt(index) + " ");
//			index++;
//		}
//		
//		System.out.println();
//		
//		
//		// for each loop
//		System.out.println("Using for each loop");
//		
//		for(char c : s.toCharArray()) {
//			System.out.print(c + " ");
//		}
		
		
		
		String s = "abcde";
		System.out.println(s);
		
		
		String upperCase = s.toUpperCase();
		
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		
		
		boolean b = s.contains("h");		// false
		boolean b1 = s.contains("b");		// true
		
		System.out.println(b);
		System.out.println(b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
