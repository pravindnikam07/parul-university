package batch55;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// int[] nums = new int[5];
		//
		// nums[0] = 3;
		// nums[1] = 4;
		//
		// System.out.println(nums[1]);

		// int[] nums = new int[] {
		// 1,2,3,45,6,7,9
		// };
		//
		// System.out.println(Arrays.toString(nums));
		//
		// for(int i = 0; i < nums.length; i++) {
		// System.out.println(nums[i]);
		// }

		// char[] chars = new char[] {
		// 'a', 'b', 'c', 'd', 'f'
		// };
		//
		// System.out.println(Arrays.toString(chars)); // ['a','b','c','d','f']
		//
		// for(int i = 0; i < chars.length; i++) {
		// System.out.println(chars[i] + " " + i); // a b c d f
		// }
		//
		// System.out.println();
		//
		// for(char c : chars) {
		// System.out.print(c); // abcdf
		// }

		// Scanner input = new Scanner(System.in);
		//
		//
		// int[] nums = new int[] {
		// 1, 4, 6,3,6,2,6,21,7,2,7,1,6
		// };
		// int target = input.nextInt();
		//
		// System.out.println(Arrays.toString(nums));
		//
		//
		// // Find the index of 21
		// for(int i = 0; i < nums.length; i++) {
		// if(nums[i] == target) {
		// System.out.println(i);
		// break;
		// }
		// }

		// Find the sum of all elements
		//
		// int[] nums = new int[] {1,5,10,23,2};
		//
		// int sum = 0;
		//
		// for(int i = 0; i < nums.length; i++) {
		// sum = sum + nums[i];
		// }
		//
		// System.out.println(sum);

		// Find the sum of all even elements

		// int[] nums = new int[] {1,5,10,23,2};
		// int sum = 0;
		//
		// for(int i = 0; i < nums.length; i++) {
		// if(nums[i] % 2 == 0) {
		// sum = sum + nums[i];
		// }
		// }
		//
		// System.out.println(sum);

		// WAP to find the product of all elements
		//
		// int[] nums = new int[] {1,5,10,23,2};
		// int product = 1;
		//
		// for(int i = 0; i < nums.length; i++) {
		// product = product * nums[i];
		// }
		//
		//
		// System.out.println(product);

		// int[] nums = new int[] {1,2,3,1,2,13,4,5,2,24,1,3,5};

		// WAP to find the all pair sum
		// int[] nums = new int[] {
		// 2, 4, 1, 3, 5, 10
		// };
		//
		// for(int i = 0; i < nums.length; i++) { // selecting first element
		// for(int j = i + 1; j < nums.length; j++) { // selecting second element
		// int sum = nums[i] + nums[j];
		// System.out.println("First element " + nums[i] + " seconds element " + nums[j]
		// + " sum is: " + sum);
		// }
		// }

		// WAP to find the all pair sum which is equal to target
		// int[] nums = new int[] {
		// 2, 4, 1, 3, 5, 10
		// };
		// int target = 6;
		//
		// for(int i = 0; i < nums.length; i++) { // selecting first element
		// for(int j = i + 1; j < nums.length; j++) { // selecting second element
		// int sum = nums[i] + nums[j];
		// if(sum == target) {
		// System.out.println("First element " + nums[i] + " seconds element " + nums[j]
		// + " sum is: " + sum);
		// }
		// }
		// }

		// WAP to find sum of three element in the given nums array

		// int[] nums = new int[] {
		// 2, 4, 1, 3, 5, 10
		// };
		//
		// for(int i = 0; i < nums.length; i++) { // selecting first element
		// for(int j = i + 1; j < nums.length; j++) { // selecting second element
		// for(int k = j + 1; k < nums.length; k++) { // selecting third element
		// int sum = nums[i] + nums[j] + nums[k];
		// System.out.println("First element " + nums[i] +
		// " seconds element " + nums[j] +
		// " third element " + nums[k] +
		// " sum is: " + sum);
		// }
		// }
		// }

		// 2d array

		// int rowLength = 3;
		// int colLength = 3;
		//
		// int[][] matrix = new int[rowLength][colLength];
		//
		// matrix[0][0] = 1;
		// matrix[1][2] = 5;
		//
		// System.out.println(matrix[1][2]);

		// for(int row = 0; row < matrix.length; row++) {
		// for(int col = 0; col < matrix[row].length; col++) {
		// System.out.print(matrix[row][col] + " ");
		// }
		// System.out.println();
		// }
		// System.out.println();
		//
		// System.out.println(Arrays.deepToString(matrix));
		//

		/*
		 * // till line 188
		 * 0 0 0
		 * 0 0 0
		 * 0 0 0
		 * 
		 * 
		 * // after line 190
		 * 
		 * 1 0 0
		 * 0 0 5
		 * 0 0 0
		 * 
		 * 
		 * 
		 * 
		 * [
		 * [1, 0, 0],
		 * [0, 0, 5],
		 * [0, 0, 0]
		 * ]
		 */

		// [
		// [1,2,3],
		// [4,5,6],
		// [7,8,9]
		// ]

		// WAP to create a 2d array and start assigning the value from 1 to row * col

		int[][] matrix = new int[4][5];

		int count = 1;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = count;
				count++;
			}
		}

		System.out.println(Arrays.deepToString(matrix));

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}
}
