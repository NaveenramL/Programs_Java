package com.demo.java8Features;

public class LambdaExpressionsDemoImpl {


	
	public static void main(String[] args) {
		LambdaExpressionsDemo dle1 = (int a,int b) ->System.out.println("The addition of two numbers is : "+(a+b));
		dle1.addition(2, 3);
	}
}
