package com.demo.localInnerClass;

public class OuterClass {

	private int data=20;
	static String name="Sairam";
	String location = "West tambaram";
	
	void message() {
		System.out.println("This is an instance method in outer class....");
		
		class InnerClass{
			void print() {
				System.out.println("This is a method inside the local inner class...");
				System.out.println("Data is : "+data);
				System.out.println("Name is : "+name);
				System.out.println("Location is : "+location);
			}
		}
		InnerClass innerObject = new InnerClass();
		innerObject.print();
	}
}
