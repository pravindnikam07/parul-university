package batch44.sorting;

import java.util.Arrays;

public class StudentsSelectioSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student[] students = new Student[] {
				new Student(3, "ravi", 650),
				new Student(7, "john", 750),
				new Student(12, "Rajesh", 560),
				new Student(1, "David", 860),
				new Student(4, "Tejas", 650),
				new Student(15, "john", 720),
		};
		
		sortStudents(students);
	}
	
	public static void sortStudents(Student[] students) {
		System.out.println(Arrays.toString(students));
		
		
		for(int i = 0; i < students.length; i++) {
			int min_index = i;
			for(int j = i + 1; j < students.length; j++) {
				if(students[min_index].roll > students[j].roll) {
					min_index = j;
				}
			}
			swap(students, min_index, i);
		}
		
		System.out.println(Arrays.toString(students));
	}
	
	public static void swap(Student[] students, int min_index, int i) {
		Student temp = students[i];
		students[i] = students[min_index];
		students[min_index] = temp;
	}

}
