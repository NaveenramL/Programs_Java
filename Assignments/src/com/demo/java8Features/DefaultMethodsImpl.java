package com.demo.java8Features;

public class DefaultMethodsImpl implements DefaultMethods{
	public void print() {
		System.out.println("Overriden default method in interface...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultMethods dm = new DefaultMethodsImpl();
		dm.print();
		
		DefaultMethodsImpl d = new DefaultMethodsImpl();
		d.print();
	}

}
