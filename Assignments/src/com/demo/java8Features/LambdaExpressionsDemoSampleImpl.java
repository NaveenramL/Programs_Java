package com.demo.java8Features;

public class LambdaExpressionsDemoSampleImpl implements LambdaExpressionsDemoSample{

	
	public void calculations(int a, int b) {
		
		if(a!=b) {
			System.out.println("The addition of two numbers is : "+(a+b));
		}
		else {
			System.out.println("Sorry we cannot perform addition...");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaExpressionsDemoSample leds1 = (int a, int b)->{
			if(a!=b)
			System.out.println("The adddition of two number is : "+(a+b)); 
		    else
			System.out.println("Sorry addition cannot be performed ...");
		};
		leds1.calculations(2, 2);
		leds1.calculations(1, 2);
	  }
	}

	


