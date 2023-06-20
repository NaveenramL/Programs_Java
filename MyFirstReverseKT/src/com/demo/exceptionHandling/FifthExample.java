package com.demo.exceptionHandling;

public class FifthExample {
	   
	public static void validate(int age) {  
	        if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	public static void main(String[] args) {
		
		//FifthExample.validate(26);
		//System.out.println("-----------");
		FifthExample.validate(13);
		

	}

}
