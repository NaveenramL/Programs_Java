package com.demo.java8Features;

public class MethodReferenceDemoImpl {

	public static void addition(int a, int b) {
		System.out.println("The addition of two number is : "+(a+b));
	}
	
	public static void main(String[] args) {
		
		MethodReferenceDemo dmr = MethodReferenceDemoImpl::addition;
		dmr.addition(10, 20);
	}
}
