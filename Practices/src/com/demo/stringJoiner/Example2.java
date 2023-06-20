package com.demo.stringJoiner;
import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner joiner = new StringJoiner(":");
		System.out.println(joiner);
		
	
		
		System.out.println(joiner.setEmptyValue("The joiner is now empty."));
	}

}
