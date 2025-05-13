package batch44.old_code;

public class StringDemo {

	public static void main(String[] args) {
		
//		String s1 = "Hello";		// String literal
//		String s3 = new String("Hello string"); // using new keyword
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(0));
//		System.out.println(s3);
		
		
//		String s1 = "Hello";
//		String s2 = "Hello";
//		System.out.println(s1 == s2); 	// true
//		
//		
//		String s3 = new String("Hello");
//		System.out.println(s1 == s3); 	// false
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s1.equals(s3)); // true
		
//		String words = "abcdefg";
		
//		for(int i = 0; i < words.length(); i++)
//			System.out.print(words.charAt(i) + " ");
//		
//		System.out.println();
//		
//		for(char c : words.toCharArray())
//			System.out.println(c + " ");
//		
//		char[] chars = words.toCharArray();
//		
//		System.out.println(words);
//		String upperCaseWords = words.toUpperCase();
//		System.out.println(upperCaseWords);
//		
//		
//		String a = "Ravi";
//		String b = "Rajesh";
//		System.out.println(a.compareTo(b));		// 
		
		
		
		
		String s = "anam"; // "racerecar";
		
//		int left = 0;
//		int right = s.length() - 1;
//		boolean isPalindrome = true;
//		while(left < right) {
//			if(s.charAt(left) != s.charAt(right)) {
//				System.out.println("String is not palindrome");
//				isPalindrome = false;
//				break;
//			}
//			left++;
//			right--;
//		}
//		
//		if(isPalindrome) {
//			System.out.println("String is palindrome");
//		}
//		
		
//		System.out.println(checkPalindrome("ama"));
	}
	
	
	public static boolean checkPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		boolean isPalindrome = true;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
	
	
}
