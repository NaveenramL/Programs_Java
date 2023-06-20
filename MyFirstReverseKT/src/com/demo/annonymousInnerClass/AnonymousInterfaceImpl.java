package com.demo.annonymousInnerClass;

public class AnonymousInterfaceImpl {

	public static void main(String[] args) {
		
		AnonymousInterface aObj = new AnonymousInterface(){

			@Override
			public void compute(int a, int b) {
				System.out.println("The addition of two values is : "+(a+b));
				
			}
			
		};
		aObj.compute(10, 10);
	}
}
