package batch44.old_code;

public class Main {

	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "World";
//		
////		s1 = s1.concat(s2);
//		s1 = s1 + s2;
//		System.out.println(s1); 	// 
		
//		char c = 'a';
//		
//		String s = "" + c;
//		
//		int i = 10;
//		s = "" + i;
		// String.valueOf();
		
		
		
//		StringBuffer
//		StringBuilder
		
		
		
		
//		StringBuffer sb = new StringBuffer();
//		sb.append("Hello");
//		sb.append(" world");
//		System.out.println(sb);
//		
//		
//		
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("Hello");
//		stringBuilder.append(false);
//		stringBuilder.insert(1, 10);
//		stringBuilder.replace(0, 1, "->");
//		System.out.println(stringBuilder);
		
		
		String s = "abcd";
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
//				System.out.println("Start index " + i + " end index " + j);
				for(int k = i; k <= j; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
		
		
		
	}
}
