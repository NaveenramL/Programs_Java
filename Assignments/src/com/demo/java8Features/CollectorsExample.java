package com.demo.java8Features;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("Python");
		al.add(".Net");
		al.add("C");
		
		Set<String> languages = al.stream().collect(Collectors.toSet());
		System.out.println(languages);
	}
}
