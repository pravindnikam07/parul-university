package accessmodifiers;

public class A {

	public void printPublic() {
		System.out.println("From A class public method");
	}
	
	void printDefault() {
		System.out.println("From A class default method");
	}
	
	private void printPrivate() {
		System.out.println("From A class private method");
	}
	
	protected void printProtected() {
		System.out.println("From A class protected method");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		a.printPrivate();
		a.printDefault();
		a.printProtected();
		a.printPublic();
		
	}
}
