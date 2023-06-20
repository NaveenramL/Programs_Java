package com.demo.java8Features;

import java.util.ArrayList;

public class ForEachMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Spring framework");
		al.add("Hibernate");
		al.add("SQL");
		al.add("Angular");
		al.add("REST API");
		
		al.forEach(tech -> System.out.println(tech));
	}

}
