package com.demo.javaExamples;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=0;
		int result;
		try {
			result = a/b;
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("This program is executed successfully....");
		}
	}

}
