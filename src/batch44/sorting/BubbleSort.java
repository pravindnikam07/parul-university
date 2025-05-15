package batch44.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 5, 1, 3, 4};
		sortIntArray(arr);
		
		char[] arr_char = new char[] {'b', 'd', 'a', 'g', 'd'};
		sortCharArray(arr_char);
		
		
		String[] arr_string = new String[] {"z", "abc", "aab", "def", "ijk"};
		sortStringArray(arr_string);
//		System.out.println("zabc".compareTo("ijk"));
	}
	
	public static void sortStringArray(String[] arr) {
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++) { // 
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j].compareTo(arr[i]) < 0) {
					swap(arr, i, j);
				}
			}
			
//			System.out.println("Pass : "+ i + " => " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	public static void sortCharArray(char[] arr) {
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++) { // 
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
			
//			System.out.println("Pass : "+ i + " => " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortIntArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++) { // 
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
			
//			System.out.println("Pass : "+ i + " => " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
