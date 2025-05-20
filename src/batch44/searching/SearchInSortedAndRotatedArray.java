package batch44.searching;

public class SearchInSortedAndRotatedArray {

	public static void main(String[] args) {
		
		int[] nums = new int[] {4,5,6,7,8,1,2,3};
		int target = 1;        
		System.out.println(search(nums, target));
	}
	
	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			
			int mid = (left + right ) / 2;
			
			if(target == nums[mid]) {
				return mid;
			}
			
			if(target < nums[mid]) {
				if(target >= nums[left]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
				
			}
			else {
				if(target <= nums[left]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
			
		}
		return -1;
	}

}
