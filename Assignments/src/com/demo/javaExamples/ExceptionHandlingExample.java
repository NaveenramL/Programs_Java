package com.demo.javaExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		try (PrintWriter writer = new PrintWriter(new File("c:\\users\\navee\\desktop\\try_test.txt"))) {
		    writer.println("Hello World");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
