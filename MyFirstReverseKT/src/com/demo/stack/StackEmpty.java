package com.demo.stack;

import java.util.Stack;

/*
Empty method checks whether the stack is Empty or not.Return type is boolean.
Returns true if the stack is empty,else returns false.
*/

public class StackEmpty {

	public static void main(String[] args) {
	

		Stack<Integer> s=new Stack<Integer>();
		s.add(1);
		s.add(7);
		s.add(25);
		s.add(59);
		s.add(85);
		s.add(109);

	   Stack<Integer> s1=new Stack<Integer>();

		boolean a=s.empty();
		System.out.println(a);

	    boolean b=s1.empty();
	    System.out.println(b);

	}

}
