package com.demo.javaExamples;
import java.util.*;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("Python");
		al.add("SQL");
		al.add(".Net");
		
		for(String languages :al){
			System.out.println(languages);
		}
		
	}

}
