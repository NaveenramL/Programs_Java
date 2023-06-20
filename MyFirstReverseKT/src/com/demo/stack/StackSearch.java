package com.demo.stack;

import java.util.Stack;

/*
Returns the index position of the given element from top of the Stack.
*/

public class StackSearch {

	public static void main(String[] args) {
	
		Stack<Integer> s=new Stack<Integer>();
		s.add(17);
		s.add(61);
		s.add(49);
		s.add(83);
		s.add(5);
		System.out.println("Stack s : "+s);
		
		System.out.println("The index position of 61 is "+s.search(61));


	}

}
