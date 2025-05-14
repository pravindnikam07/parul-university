package batch55.strings;

public class StringABCXYZ {

	public static void main(String[] args) {
		
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " => " + i);
		}
		
		System.out.println("============================");
		
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i) + " => " + i);
		}
		
		
		
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
	}
}
