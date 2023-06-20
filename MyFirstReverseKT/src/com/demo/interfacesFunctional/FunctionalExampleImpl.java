package com.demo.interfacesFunctional;

public class FunctionalExampleImpl implements FunctionalExample{

	public void compute(int a, int b) {
		System.out.println("The addition of two input values is : "+(a+b));
		System.out.println("The Multiplication of two input values is : "+(a*b));
	}
}
