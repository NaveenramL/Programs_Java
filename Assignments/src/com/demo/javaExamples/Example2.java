package com.demo.javaExamples;

/*This program is used to demonstrate 
 * about Static inner classes with instance methods*/

public class Example2 {

	static int a=10;
	int b = 20;
	
	static class Innerclass{
		public  void display() {
			System.out.println("The value of a is : "+a);
			//System.out.println("The value of b is : "+b);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example2.Innerclass e = new Example2.Innerclass();
		e.display();
		
	}

}
