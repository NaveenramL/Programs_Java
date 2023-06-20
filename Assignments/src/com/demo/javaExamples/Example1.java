package com.demo.javaExamples;

/*This program is used to demonstrate 
 * about Static inner classes with static methods*/


public class Example1 {
	static int a=10;
	int b = 20;
	
	static class Innerclass{
		public static void display() {
			System.out.println("The value of a is : "+a);
			//System.out.println("The value of b is : "+b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1.Innerclass.display();
	}

}
