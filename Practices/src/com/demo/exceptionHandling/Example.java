package com.demo.exceptionHandling;

public class Example {
	
	public void divide(int i, int j) {
		
			if(j==0) {
				throw new RuntimeException("Input values cannot be Zero '0'...");
				
			}
			else {
				System.out.println("The division of two numbers is : "+(i%j));
			}
		
		
	}
public static void main(String[] args) {
	Example e1 = new Example();
	e1.divide(2, 0);
}
}
