package batch55.complexity;

public class TCExamoles {

	public static void main(String[] args) {
		
		
		// Example 1
//		int n = 100000;
//		for(int i = 0; i < n; i++) {
//			if(i % 2 == 0)
//				System.out.println("Even number");
//		}
		// tc => O(n)
		
		
		// Example 2
//		int n = 100000;
//		for(int i = 0; i < n; i = i + 2) { 		// n
//			if(i % 2 == 0)
//				System.out.println("Even number");
//		}
		// tc => O(n)
		
		
		
//		// Example 3
//		int n = 100000;
//		for(int i = n; i >=0; i = i / 2) {
//			if(i % 2 == 0)
//				System.out.println("Even number");
//		}		
//		// tc => O(log(n))
//		
		
		// Example 4
//		int n = 100000;
//		for(int i = 1; i < n; i = i * 2) {
//			if(i % 2 == 0)
//				System.out.println("Even number");
//		}		
		// tc => O(loc(n))
		
		
		
		// Example 5
//		int n = 100000;
//		for(int i = 0; i < n; i = i++) {  	// n
//			for(int j = 0; j < n; j++) 		// n
//				if(i % 2 == 0)
//					System.out.println("Even number");
//		}		
		// tc => O(n^2)
		
		
		// Example 6
//		int n = 100000;
//		for(int i = 0; i < n; i = i++) {  
//			for(int j = n; j > 0; j = j / 2)
//				if(i % 2 == 0)
//					System.out.println("Even number");
//		}		
		// tc => O(n * log(n))
		
		
		
		// Example 7
//		int n = 100000;
//		for(int i = 0; i < n; i = i++) {  	// n
//			for(int j = 0; j < n; j = j + n) 		
//				if(i % 2 == 0)
//					System.out.println("Even number");
//		}		
		// tc => O()
		
		
		
		// Example 8
//		int n = 100000;
//		int[] arr = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = i;
//		}
		
		// tc => O(n)
		// sc => O(n)
		
		
		
		// Example 9
//		int n = 100000;
//		for(int i = 0; i < Math.sqrt(n); i++) {
//			System.out.println(i);
//		}
		
		// tc => O(sqrt(n)
		// sc => O(1)
		
		
		
		
		
	}
}
