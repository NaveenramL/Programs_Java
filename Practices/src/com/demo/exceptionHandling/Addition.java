package com.demo.exceptionHandling;

public class Addition {

	int add(int i, int j) {
		if(i>=0 && j>=0)
			return -1;
		//System.out.println(i+j);
		else
		//	System.out.println("Please enter postive integers....");
		return i+j;
	}
	
	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.add(-2, 2);
	}
}
