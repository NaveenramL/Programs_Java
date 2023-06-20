package com.demo.memberInnerClass;

public class OuterClass {

	private int data=20;
	String name = "Naveenram";
	static int value = 1;
	
	void print() {
		System.out.println("This is an instance method in Outer class....");
	}
	
	static void message() {
		System.out.println("This is a static method in the Outer class....");
	}
	
	class InnerClass{
		void display() {
			System.out.println("Data is : "+data);
			System.out.println("Name is : "+name);
			System.out.println("Value is : "+value);
			print();
			message();
		}
	}
}
