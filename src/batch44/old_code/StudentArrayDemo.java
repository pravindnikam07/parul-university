package batch44.old_code;

import java.util.Arrays;

public class StudentArrayDemo {

	public static void main(String[] args) {
		// class_name variable_name = new class_name(parameters);
		
//		Student s1 = new Student();
//		s1.name = "ravi";
//		s1.roll = 12;
		
		Student s1 = new Student("Ravi", 12);
		Student s2 = new Student("Rahul", 2);
		Student s3 = new Student("Shantanu", 22);
		Student s4 = new Student("Abhi", 5);
		Student s5 = new Student("Prakash", 1);
		Student s6 = new Student("Mayan", 33);
//		System.out.println(s1.name);
//		System.out.println(s1.roll);
		
		Student[] batch44 = new Student[6];
		batch44[0] = s1;
		batch44[1] = s2;
		batch44[2] = s3;
		batch44[3] = s4;
		batch44[4] = s5;
		batch44[5] = s6;
		
		
//		System.out.println(Arrays.toString(batch44));
		
		
		// search student whose name is "Abhi"
		
//		for(Student s : batch44) {
//			if(s.name == "Abhi") {
//				System.out.println(s);
//				break;
//			}
//		}
		
		// Search student by roll number 30
//		boolean isPresent = false;
//		for(int i = 0; i < batch44.length; i++) {
//			if(batch44[i].roll == 33) {
//				isPresent = true; // !isPresent;
//				System.out.println(batch44[i].roll + " " + batch44[i].name);
//				break;
//			}
//		}
//		
//		if(!isPresent) {
//			System.out.println("Student not found");
//		}
		
		
		
		
		// Reverse the array
//		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		
//		int left = 0;
//		int right = nums.length - 1;
//		System.out.println(Arrays.toString(nums));
//		while(left < right) {
//			int temp = nums[left];
//			nums[left] = nums[right];
//			nums[right] = temp;
//			
//			left++;
//			right--;
//		}
//		
//		System.out.println(Arrays.toString(nums));
		
		
		
//		int a = 5;
//		int b = 10;
		
//		System.out.println("a " + a + " b " + b);
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("a " + a + " b " + b);
//		
		
	
		
		
		// Merge two sorted arrays
//		int[] nums1 = new int[] {3, 5, 7, 8, 9};
//		int[] nums2 = new int[] {1, 2, 4, 12};
//		
//		int[] nums3 = new int[nums1.length + nums2.length];
//		
//		int p1 = 0;
//		int p2 = 0;
//		int p3 = 0;
//		
//		while(p1 < nums1.length && p2 < nums2.length) {
//			if(nums1[p1] < nums2[p2]) {
//				nums3[p3] = nums1[p1];
//				p1++;
//				p3++;
//			}
//			else {
//				nums3[p3] = nums2[p2];
//				p2++;
//				p3++;
//			}
//		}
//		
//		while(p1 < nums1.length) {
//			nums3[p3] = nums1[p1];
//			p1++;
//			p3++;
//		}
//		
//		while(p2 < nums2.length) {
//			nums3[p3] = nums2[p2];
//			p2++;
//			p3++;
//		}
		
//		System.out.println(Arrays.toString(nums3));
		
		
		
		// Find the sum of all element in the array
//		int[] nums = new int[] {781, 62, 30, 41, 5, 63, 7, 58, 9};
//		
//		int sum = 0;
//		for(int num : nums)
//			sum += num;
//		
//		System.out.println(sum);
//		
		
		
		
		
	
	}
}

