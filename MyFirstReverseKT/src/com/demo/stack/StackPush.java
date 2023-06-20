package com.demo.stack;

/*
Push method pushes the given element to the top of the Stack.
*/

import java.util.Stack;

public class StackPush {

	public static void main(String[] args) {
		
		Stack<String>  s=new Stack<String>();
		s.add("Hibernate");
		s.add("MicroServices");
		s.add("Angular");
		s.add("HTML");
		s.add("CSS");
		System.out.println("Stack s before using push method is : "+s);
		
		s.push("Java");
		System.out.println("Stack s after using push method is : "+s);


	}

}
