package com.demo.accessmodifiers;

public class Example {

	private int a = 10;
	
	void valueChange() {
		int a = 200;
		System.out.println("The value of A is : "+a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example e1 = new Example();
		System.out.println(e1.a);
		e1.a=20;
		System.out.println(e1.a);
	}

}
