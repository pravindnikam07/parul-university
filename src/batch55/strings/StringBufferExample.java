package batch55.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		
		// StringBuffer
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		
		StringBuffer sb1 = new StringBuffer("abc");
		
		
		System.out.println(sb);				// abcdef
		System.out.println(sb.charAt(0)); 	// a
		System.out.println(sb.length()); 	// 6
		System.out.println(sb.compareTo(sb1));	// 3
		System.out.println(sb.equals(sb1));	 	// false
		
		sb1.append("def");
		System.out.println(sb1);
		System.out.println(sb.toString().equals(sb1.toString()));	 	// true
		System.out.println(sb.toString());  							// to make stringBuffer to String type
		System.out.println(sb.hashCode()); 								// to get to hashcode of a perticular object
		sb.delete(1, 2);						// deleting the characters from start index till end index
		System.out.println(sb);
		sb.insert(0, "pqr");
		System.out.println(sb);
		sb.replace(1, 5, "ABC");
		System.out.println(sb);
		
		
		
		
		
		// StringBuilder 
		
		StringBuilder sbr = new StringBuilder("pqr");
		sbr.append("asdaf");
		System.out.println(sbr);				// pqrasdf
		System.out.println(sbr.length()); 		// 7
		System.out.println(sbr.charAt(2));  	// r
		System.out.println(sbr.toString()); 	// to convert the StringBuilder object to the String object
		System.out.println(sbr.hashCode());     // to get the hashcode value of the given StringBuilder object
		System.out.println(sbr.indexOf("a"));	// 3 to get the first occurrence of the particular character
		sbr.insert(2, 2);						// offsetting by 2 characters and then insert without deleting the elements
		System.out.println(sbr);
		sbr.replace(4, 6, "GHJ");				// to replace the characters from starting index till end index
		System.out.println(sbr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// String
		
		String s = "abc";
		s.concat("def");
//		System.out.println(s);				// abc

	}

}
