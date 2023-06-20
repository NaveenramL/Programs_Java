package com.demo.exceptionHandling;

public class SecondExample {

	public static void main(String[] args) {
		
		String name = "Sairam";
		try {
			System.out.println(name.charAt(7));
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
