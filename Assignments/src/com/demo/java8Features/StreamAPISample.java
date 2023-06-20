package com.demo.java8Features;

import java.util.Arrays;
import java.util.List;

/*This program is compiled and run in Java 1.8
 * This program consists of list with values in it.
 * It is then converted into stream and using map function each value is multiplied by three,
 * The output of the map function is given as an input to filter function,
 * to filter out the odd values and only even values are given as output.
 * this output is again given as an input to forEach method to print it.*/

public class StreamAPISample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		list.stream().map(i->i*3).filter(i->i%2==0).forEach(i->System.out.println(i));
	}

}
