package dsa_44.old_code;

public class Methods {

	public static void main(String[] args) {
		sayHello();
		Methods.sayHello();
		Methods rec = new Methods();
		rec.sayHello();
		
		
		rec.nonStaticMethod();
		
		int ans = rec.add(2, 4);
		System.out.println(ans);
		System.out.println(rec.add(5, 15));
	}
	
	// access_modifier static/non-static return_type method_name(param){}

	public int add(int a, int b) {
		return a + b;
	}
	
	public static void sayHello() {
		System.out.println("sayHello static methods of Recursion class");
	}
	
	public void nonStaticMethod() {
		System.out.println("From non static method of Recursion class");
	}
}
