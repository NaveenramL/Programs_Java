package com.demo.aggregation;

public class MainMethod {

	public static void main(String[] args) {
		Marks firstStudentMarks = new Marks(95, 80,100);
		Student s1 = new Student(100, "Naveenram", firstStudentMarks);
		
		Marks secondStudentMarks = new Marks(75, 92, 67);
		Student s2 = new Student(101, "Lakshmanan", secondStudentMarks);
		
		s1.studentDetails();
		s2.studentDetails();

	}

}
