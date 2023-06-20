package com.demo.javaExamples;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionHandlingSecondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(new File("c:\\users\\navee\\desktop\\try_test.txt"));
			    PrintWriter writer = new PrintWriter(new File("c:\\users\\navee\\desktop\\testWrite.txt"))) {
			    while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			    }
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
