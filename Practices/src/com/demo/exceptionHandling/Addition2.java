package com.demo.exceptionHandling;

public class Addition2 {

	public static int add1(int i1, int i2) {
		if(i1>200) {
			throw new RuntimeException(" Please enter value of input 1 less than 200...");
	}
		return i1+i2;
	}
	
	public static int add2(int i3, int i4)  {
		add1(i3,i4);
		return i3+i4;
	}
	
	public static int add3(int i5,int i6)  {
		add2(i5,i6);
		return i5+i6; 
	}
	
	public static void main(String[] args) {
		int result = 0;
		
		result = Addition2.add3(200, 8);
		System.out.println("Addition of two numbers is : "+result);
		/*
		 * try { result = Addition2.add3(201, 10);
		 * System.out.println("Sum of two numbers is : "+result); } catch (Exception e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */ 
		
	}
}
