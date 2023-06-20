package com.demo.java8Features;

public interface DefaultMethodsExample {

	default void printMessage() {
		System.out.println("This is first default method in interface ....");
	}
	
	default void addition(int a, int b) {
		System.out.println((a+b));
	}
}
