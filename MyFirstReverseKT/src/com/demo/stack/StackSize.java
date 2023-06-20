package com.demo.stack;

import java.util.Stack;

/*
Returns the number of elements in the Stack.
Size method is implemented from Collection interface.
*/

public class StackSize {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();	
	    s.add("Interface");
	    s.add("Eclipse");
	    s.add("Database");
	    s.add("Constructor");
	    s.add("Boolean");
	    System.out.println("Stack s : "+s);
	    
	    int a=s.size();
	    System.out.println("The Size of the Stack is "+a);


	}

}
