package com.demo.stringJoiner;

import java.util.StringJoiner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner joiner = new StringJoiner(":");
		joiner.add("Java");
		joiner.add("Spring");
		
		System.out.println("The elements in the Joiner 1 are : "+joiner);
	    
		StringJoiner joiner2 = new StringJoiner(",");
		joiner2.add("Hibernate");
		joiner2.add("database");
		
		System.out.println("The elements in the Joiner 2 are : "+joiner2);
		
		System.out.println("After Merging String Joiner 2 with String Joiner 1 : "+joiner2.merge(joiner));
	}

}
