package com.demo.javaExamples;


/* This program is to demonstrate static methods
 * and static variables
 * 
 * */

public class Example {

	static int a =5;
	
	public void print() {
		System.out.println("This is a print mehtod .....");
	}
	
	public static void display() {
		System.out.println("This is a static method ....");
	}
	
	public static void main(String[] args) {
		
		Example.display();
		System.out.println(Example.a);
		
		Example e1 = new Example();
		e1.print();
	}
}
