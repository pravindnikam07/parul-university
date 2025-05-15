package batch44.sorting;

import java.util.Arrays;

public class SortTwoArrays {

	public static void main(String[] args) {
		int[] roll = new int[] {3, 1, 5, 6, 2, 4};
		String[] name = new String[] {"Rajesh", "Aman", "Ravi", "Jhon", "David", "Nirav"};
	
		sort(name, roll);
	
	}
	
	
	public static void sort(String[] name, int[] roll) {
		
		System.out.println(Arrays.toString(roll));
		System.out.println(Arrays.toString(name));
		
		for(int i = 0; i < roll.length - 1; i++) {
			for(int j = i + 1; j < roll.length; j++) {
				if(roll[j] < roll[i]) {
					swap(roll, i, j);
					swap(name, i, j);
				}
			}
		}
		
		System.out.println(Arrays.toString(roll));
		System.out.println(Arrays.toString(name));
	}
	
	
	
	public static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
