package dsa.leetcode.practice;

import java.util.Arrays;

public class MultidirectionalArrays {
	public static void main(String[] args) {
//		int[] arr = new int[3];
		// data_type[][] variable_name = new data_type[size][size];
		
		// int[][] matrix = new int[3][4]; // 2D
		// int[][][] matrix = new int[3][4][5]; // 3D
		
		
//		
		int[][] matrix = new int[3][4];
		
//		int[] arr = new int[] {1,2,3,4};
//		matrix[0] = arr;
//		matrix[0][0] = 1;
//		matrix[0][1] = 2;
		int count = 1;
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 4; col++) {
				matrix[row][col] = count;
				count++;
			}
		}
		
		// for loop
//		for(int row = 0; row < 3; row++) {
//			for(int col = 0; col < 4; col++) 
//				System.out.print(matrix[row][col] + " ");
//			
//			System.out.println();
//		}
		
		// for each loop
		for(int[] arr : matrix) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
		
//		System.out.println(Arrays.deepToString(matrix));
		
		
		
		
		
		
//		int[] nums = new int[50];
//		
//		for(int i = 0; i < 50; i++) {
//			nums[i] = i;
//		}
		// for loop
//		for(int i = 0; i < 50 ; i++) {
//			System.out.println(i + " => " + nums[i]);
//		}
		
		// for each loop
		
		// for(data_type variable_name : source)
		
//		for(int num : nums) {
//			System.out.println(num);
//		}
		
//		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
	}
}
