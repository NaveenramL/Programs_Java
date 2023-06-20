package com.demo.java8Features;

public class StaticBlockExample {

	public void print() {
		System.out.println("This is a print method .....");
	}
	
	static {
		System.out.println("This is a Static block.....");
	}
	
	public static void main(String[] args) {
		
		StaticBlockExample esb1 = new StaticBlockExample();
		StaticBlockExample esb2 = new StaticBlockExample();
		
		esb1.print();
		esb2.print();
	}
}
