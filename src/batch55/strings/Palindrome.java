package batch55.strings;

public class Palindrome {

	public static void main(String[] args) {
		String s = "aman";		// "racerecar"
		
		String s2 = "";
		
		// using reversing the string
		for(int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);  
		}
		
		/*
		 
		 1st iteration =>  "" + "n" => "n"
		 2nd iteration =>  "n" + "a"=> "na"
		 3rd iteration =>  "na" + "m" => "nam"
		 4th iteration =>  "nam" + "a" => "nama"
		 
		 */
		
		System.out.println(s);
		System.out.println(s2);
		
		if(s.equals(s2)) {
			System.out.println("String is palindrome!...");
		}
		else {
			System.out.println("String is not palindrome!...");
		}
		
		
		System.out.println("+-+-+-+-+-+-+-+-+");
		// using two pointers
		int left = 0;
		int right = s.length() - 1;
		boolean isPalindrome = true;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				System.out.println("String is not palindrome!...");
				isPalindrome = false;
				break;
			}
			
			left++;
			right--;
		}
		
		if(isPalindrome) {
			System.out.println("String is palindrome");
		}
		
	}
}
