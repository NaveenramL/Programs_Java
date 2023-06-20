package com.demo.stack;

import java.util.Stack;


/*
ElementAt method returns the element at the specified index.
ElementAt method is inherited from class java.util.Vector.
*/

public class StackElementAt {

	public static void main(String[] args) {
		

		Stack<Integer> k=new Stack<Integer>();
		k.add(9);
		k.add(41);
		k.add(79);
		k.add(108);
		k.add(3);
		System.out.println("Stack k : "+k);
		
		System.out.println("The Element at index position 1 is "+k.elementAt(1));

	}

}
