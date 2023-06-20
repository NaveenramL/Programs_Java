package com.demo.stringJoiner;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner joiner = new StringJoiner(".");
		joiner.add("Java");
		joiner.add("1.8");
		System.out.println("The elements in the joiner are : "+joiner);
		
		String s = joiner.toString();
		System.out.println(s);
	}

}
