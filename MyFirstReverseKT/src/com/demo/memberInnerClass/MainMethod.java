package com.demo.memberInnerClass;

public class MainMethod {

	public static void main(String[] args) {
		
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		
		outerObject.print();;
		OuterClass.message();
		System.out.println("--------------------");
		
		innerObject.display();

	}

}
