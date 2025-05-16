package batch44.searching;

public class SearcgInSortedArray {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,4,5,9,12};
		int target = 5;
		
		int left = 0;					// 0 3 3
		int right = nums.length - 1;	// 5 5 3
		boolean isFounded = false;
		
		while(left <= right) {
			int mid = left + ((right - left) / 2); // (right+left)/2 // 2 4 3
			
			if(nums[mid] == target) {
				System.out.println("Element " + target + " found at index " + mid);	// print
				isFounded = true;
				break;
			}
			else if(nums[mid] > target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}

		if(!isFounded) {
			System.out.println("Element " + target + " is not present in the nums array");
		}
	}

}
