package dsa_44;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

	List<Integer> series = new ArrayList<>();
	public static void main(String[] args) {
//		System.out.println(new Recursion().factorial(5));
//		System.out.println(new Recursion().factorial(7));
//		System.out.println(new Recursion().fub(4));
//		System.out.println(new Recursion().fub(5));
//		Recursion rec = new Recursion();
//		rec.series.add(0);
//		rec.series.add(1); 
//		rec.fub(5);
//		System.out.println(rec.series);
		
		
//		int a = 2; // 1 term
//		int b = 3;	// 2nd term
//		int n = 5;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		while(n-- >= 2) {
//			int third_value = a + b; // 3rd term
//			System.out.println(third_value);
//			a = b;
//			b = third_value;
//		}
		
		Recursion rec = new Recursion();
//		rec.printRec(10);
		rec.printRec1(10, 1);
		
	}
	
	void printRec1(int n, int index) {
		System.out.println(index);
		if(index == n)
			return;
		
		printRec1(n, index + 1);
	}
	
	void printRec(int n) {
		System.out.println(n);
		if(n == 1)
			return;
		
		printRec(n - 1);
	}
	
	
	int factorial(int n) {
		if(n == 1) {
			return n;
		}
		return n * factorial(n - 1);
	}
	
	int fub(int n) {
		if(n == 3 || n == 2)
			return n;
		
		int sum = fub(n - 1) + fub(n - 2);
		series.add(sum);
		return sum;
	}
}
