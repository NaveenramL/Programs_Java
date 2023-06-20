package com.demo.stack;

import java.util.Stack;

/*
Peek method returns the element at the top of the Stack.
*/

public class StackPeek {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<Integer>();
	    st.add(40);
	    st.add(90);
	    st.add(126);
	    st.add(1);
	    st.add(70);
	   System.out.println("Stack st : "+st); 
	   
	   System.out.println("Stack st after using peek method is : "+st.peek());


	}

}
