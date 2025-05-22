package batch44.stack;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		String s = "((())";
		
		// ()() => true
		// ((() => false
		// ()(()()) => true
		// (()() => false
		// )))((( => false
		// {()(}) => false
		
		Stack<Character> chars = new Stack<>();
		
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) {
				chars.add(s.charAt(i));
			}
			else {
				char lastElement = chars.pop();
				if(!check(lastElement, s.charAt(i))) {
					System.out.println("Not valid parentheses");
					return;
				}
			}
		}
		
		if(chars.isEmpty())
			System.out.println("String is Valid parentheses");
		else 
			System.out.println("Not valid parentheses");
	}
	
	public static boolean check(char lastElement, char currElement) {
		if(lastElement == '(' && currElement == ')')
			return true;
		else if(lastElement == '[' && currElement == ']')
			return true;
		else if(lastElement == '{' && currElement == '}')
			return true;
		else 
			return false;
	}
}
