package batch44.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {28, 10, 14, 37, 13};
		SelectionSortIncreasing(arr);
		SelectionSortDecreasing(arr);
		
		
		String[] cities = new String[] {
				"Udaypur", "Delhi", "Patna", "Bhuvaneshwar", "Ranchi", "Mumbai"
		};
		
		// WAP to sort string array using selection sort
  		
 	}
	
	public static void SelectionSortDecreasing(int[] arr) {
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {	// selecting first element
			int max_index = i;
			for(int j = i + 1; j < arr.length; j++) { // check the minimum element
				if(arr[max_index] < arr[j]) {
					max_index = j;
				}
			}
			swap(arr, i, max_index);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void SelectionSortIncreasing(int[] arr) {
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {	// selecting first element
			int min_index = i;
			for(int j = i + 1; j < arr.length; j++) { // check the minimum element
				if(arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			swap(arr, i, min_index);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int i, int min_index) {
		int temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = temp;
	}

}
