package com.demo.staticInnerClass;

public class OuterClass {

	static int value=100;
	int data=10;
	
	void display() {
		System.out.println("This is a instance method in outer class....");
	}
	
	static class InnerClass{
		
		static void print() {
			System.out.println("This is a static method inside static inner class...");
		}
		
		void displayValue() {
			System.out.println("Value is : "+value);
			//System.out.println("Data is : "+ data);
		}
	}
	
	public static void main(String[] args) {
		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		obj.displayValue();
		
		InnerClass.print();
	}
}
