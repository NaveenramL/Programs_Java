package com.demo.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SixthExample {

    public static void method() throws FileNotFoundException {  
    	  
        FileReader file = new FileReader("C:\\Users\\navee\\desktop\\abcde.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        throw new FileNotFoundException();  
      
    }  
	
	public static void main(String[] args) throws FileNotFoundException{
		
		SixthExample.method();

	}

}
