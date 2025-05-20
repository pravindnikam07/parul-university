package batch55.strings;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		String s = "amanam";
		String s1 = "";
		
		for(int i = 0;  i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				String subStr = "";
				for(int k = i; k <= j; k++) {
					subStr += s.charAt(k);
				}
				if(checkPalindrome(subStr)) {
					if(s1.length() < subStr.length()) {
						s1 = subStr;
					}
				}
//				System.out.println(subStr + " => " +checkPalindrome(subStr));
			}
		}
		
		System.out.println(s1);
	}
	
	public static boolean checkPalindrome(String s) {
		
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			if(s.charAt(right) != s.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

}
