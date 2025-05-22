package batch55.practice_problems;

public class StudentRunner {

	public static void main(String[] args) {
		
//		Student s = new Student();
////		s.name = "Manikant";
////		s.roll = 45;
////		s.marks = 880;
//		
//		System.out.println(s);
//		
//		Student s1 = new Student(23, "Mayank", 890);
////		s1.roll = 22;
//		
//		System.out.println(s1);
		
		
		Student s1 = new Student(23, "Mayank", 890);
		
		
		s1.setMarks(900, "@#321");
		
		System.out.println(s1.getMarks());
		
		
		
		// WAP to create Student array and add 5 students in it.
	}

}
