package com.demo.stack;

import java.util.Stack;

/*
InsertElementAt method inserts the specified element at the specified 
index position in the Stack.
InsertElementAt method is inherited from class java.util.Vector.
*/

public class StackInsertElementAt {

	public static void main(String[] args) {
	

		Stack<Integer> sa=new Stack<Integer>();
	    sa.add(90);
	    sa.add(81);
	    sa.add(1);
	    sa.add(123);
	    sa.add(156);
	    sa.add(200);
	    System.out.println("Stack sa : "+sa);
	    
	    sa.insertElementAt(110, 4);
	    System.out.println("Stack sa after using insertElement method is : "+sa);

	}

}
