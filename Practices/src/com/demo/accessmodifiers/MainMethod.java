package com.demo.accessmodifiers;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example e1 = new Example();
		//e1.a=20;
		//System.out.println(e1.a);
		
		e1.valueChange();
		
		Example1 example1 = new Example1();
		System.out.println(example1.salary);
		example1.salary=40000;
		System.out.println(example1.salary);
		
		Student s1 = new Student();
		s1.printDetails();
	}
}
