package batch44.searching;

public class LowerAndUpperBounds {

	public static void main(String[] args) {
		
		// WAP to find the lower bound and upper bound of 2.
		int[] nums = new int[] {1,2,2,2,2,2,3,4,7,8};
		System.out.println(lowerBound(nums, 2));	// first occurrence
		System.out.println(upperBound(nums, 2));	// last occurrence
		
		// 2 => 1 LB & 5 UB
		// 5 - 1 + 1 => 5
		// 8 => 9 LB & 9 UB
		// 9 - 9 + 1 => 1
	}
	
	public static int lowerBound(int[] arr, int boundOf) {
		
		int left = 0;
		int right = arr.length - 1;
		int index = -1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] >= boundOf) {
				right = mid - 1;
				if(arr[mid] == boundOf)
					index = mid;
			}
			else {
				left = mid + 1;
			}
		}
		
		return index;
	}
	
	
	public static int upperBound(int[] arr, int boundOf) {
		
		int left = 0;
		int right = arr.length - 1;
		int index = -1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] <= boundOf) {
				left = mid + 1;
				if(arr[mid] == boundOf)
					index = mid;
			}
			else {
				right = mid - 1;
			}
		}
		
		return index;
	}

}
