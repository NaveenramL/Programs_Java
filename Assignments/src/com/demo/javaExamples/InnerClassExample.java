package com.demo.javaExamples;

/*This program is used to demonstrate inner class*/


public class InnerClassExample {

	static int a=1;
	int b=2;
	private int c=3;
	
	class Innerclass{
		void printDetails() {
			System.out.println("The value of a is : "+a);
			System.out.println("The value of b is : "+b);
			System.out.println("The value of c is : "+c);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassExample e = new InnerClassExample();
		InnerClassExample.Innerclass obj = e.new Innerclass();
		obj.printDetails();
	}

}
