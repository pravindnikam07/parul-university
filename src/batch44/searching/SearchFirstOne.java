package batch44.searching;

public class SearchFirstOne {

	public static void main(String[] args) {
		
		// WAP to find the first occurrence of 1 in give 0's and 1's sorted array
		int[] arr = new int[] {0,0,0,0,0,0,0,1,1,1,1,1,1}; 
		
		System.out.println(firstOccurrence(arr));

	}
	
	public static int firstOccurrence(int[] arr) {
		
		int left = 0;
		int right = arr.length - 1;
		int index = -1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == 1) {
				right = mid - 1;
				index = mid;
			}
			else {
				left = mid + 1;
			}
		}
		
		return index;
	}
}
