package batch55.strings;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		String s = "abcd";
		
		for(int start = 0; start < s.length(); start++) {
			for(int end = start; end < s.length(); end++) {
				String subStr = "";
				for(int i = start; i <= end; i++) {
					subStr = subStr + s.charAt(i);
				}
				System.out.println(subStr);
			}
		}
	}
}
