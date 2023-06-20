package com.demo.java8Features;

public class DeafultMethodsExampleImpl implements DefaultMethodsExample{

	
	
	public void printMessage() {
		DefaultMethodsExample.super.printMessage();
	    System.out.println("This is a overriden method of default method in interface...");
	}
	
	public void addition(int a, int b) {
		System.out.println("The addition of two numbers is : "+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeafultMethodsExampleImpl obj = new DeafultMethodsExampleImpl();
		obj.printMessage();
		obj.addition(100, 200);
		
	}

}
