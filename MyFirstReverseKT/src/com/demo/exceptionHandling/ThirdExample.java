package com.demo.exceptionHandling;

public class ThirdExample {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		try {
			System.out.println(array[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
