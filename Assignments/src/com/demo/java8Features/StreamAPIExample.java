package com.demo.java8Features;

import java.util.Arrays;
import java.util.List;

/*This program is compiled and run in Java 1.8
 * This program consists of List with values in it.Then this list is converted into stream
 * After converting into stream using filter we filter out odd values.Only even values are
 * given as an input to forEach method to print it.*/

public class StreamAPIExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
	}
}
