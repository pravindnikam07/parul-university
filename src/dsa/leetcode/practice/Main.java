package dsa.leetcode.practice;

public class Main {
	static int[] arr_static = new int[5];
	int[] arr_instance = new int[5];
	public static void main(String[] args) {
		
//		int[] arr_local = new int[6]; 
//		
//		Main m = new Main();
//		m.printArray(arr_local);
		
		
		
		
		
		
		byte[] b_arr = new byte[5];
		Integer[] int_arr = new Integer[5];
		String[] s_arr = new String[10];
		s_arr[0] = "abc";
		
		
		A[] a_arr = new A[5];
		A a_obj = new A();
		a_arr[0] = a_obj;
		a_arr[1] = new A();
		
		
		
		
		
//		A[] a_arrays = new A[5];
//		a_arrays[0] = new A();
	}
	
	
	public void printArray(int[] arr) {
		
	}
}

class A {
	int a = 10;

	@Override
	public String toString() {
		return "" + a;
	}
	
	
}
