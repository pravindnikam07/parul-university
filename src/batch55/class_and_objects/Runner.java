package batch55.class_and_objects;

public class Runner {

	public static void main(String[] args) {
		
		// Creating student object with default constructor
		Student s = new Student();
		s.roll = 5;
		s.name = "Rahul";
		s.marks = 560;
		System.out.println(s.roll);
		System.out.println(s.name);
		System.out.println(s.marks);
		

		System.out.println("======================");
		
		// Creating student object with default constructor
		Student s1 = new Student();
		s1.roll = 10;
		s1.name = "Jhon";
		s1.marks = 900;
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		
		
		System.out.println("======================");
		
		// Creating student object using parameterized constructor
		Student s2 = new Student(15, "David", 750);
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		s2.studentInTheClass();
		s2.studentWithFriends();
		
		
		System.out.println("======================");
		
		Student s3 = new Student("Prakash", 980.0);
		System.out.println(s3.roll); 	// 0
		System.out.println(s3.name);	// Prakash
		System.out.println(s3.marks);	// 980
		s3.studentInTheClass();
		s3.studentWithFriends();
		
	}

}
