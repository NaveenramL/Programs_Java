package com.demo.aggregation;

public class Student {

	int rollno;
	String name;
	Marks marks;
	
	public Student(int rollno, String name, Marks marks) {
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	void studentDetails() {
		System.out.println(rollno+" "+name+" "+marks.tamilMarks+" "+marks.englishMarks+" "+marks.mathsMarks);
	}
}
