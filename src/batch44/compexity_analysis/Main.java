package batch44.compexity_analysis;

public class Main {

	public static void main(String[] args) {
		// Time and space complexity
		
		
//		int a = 4;				// 1
//		System.out.println(a);	// 1
//		
		
		// tc => 1 + 1 => O(1)
		
		
		
		
		// example 2
//		int n = 10000000;   			// 1
//		int[] arr = new int[n];			// 1
//		int sum = 0;					// 1
//		
//		for(int i = 0; i < n; i++) {	// n + 1
//			sum += arr[i];				// 1
//		}
//		System.out.println(sum);		// 1
//		
		
		// tc => 1 + 1+ 1 + n+1 + 1 +1 => n + 6  => O(n)
		
		
		
		
		
		
		
		
		
		// example 3
		int n = 10000000;   			// 1
		int[][] arr = new int[n][n];	// 1
		int sum = 0;					// 1
		
		for(int i = 0; i < n; i++) {	// n + 1
			for(int j = 0; j < n; j++) {// (n + 1) (n + 1)
				sum += arr[i][j];		// 	1
			}
		}
		System.out.println(sum);		// 1
		
		// tc => 1 + 1 + 1 + n + 1 + ((n+1)(n+1)+ 1 + 1
		// 6 + n + 2n^2 + 2n + 1
		// 2n^2 + 3n + 7
		// 2n^2
		// n^2
		
		
		// O(n^2)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
