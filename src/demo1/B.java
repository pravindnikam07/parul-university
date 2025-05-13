package demo1;

import accessmodifiers.A;

public class B extends A {
	
	public static void main(String[] args) {
		B b = new B();
		b.printProtected();
//		b.printDefault();
	}
}