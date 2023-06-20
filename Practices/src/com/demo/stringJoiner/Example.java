package com.demo.stringJoiner;

import java.util.StringJoiner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner joiner = new StringJoiner(",");
		joiner.add("Naveen");
		joiner.add("ram");
		
		System.out.println("The elements in this String Joiner are : "+joiner);
		
		System.out.println("The length of this StringJoiner is : "+joiner.length());
	}

}
