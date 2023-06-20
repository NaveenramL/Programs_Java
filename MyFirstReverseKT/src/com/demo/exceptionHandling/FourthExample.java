package com.demo.exceptionHandling;

public class FourthExample {

	void division(int a, int b) {
		try {
			int result = (a/b);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Program excecuted successfully...");
		}
	}
	
	
	public static void main(String[] args) {
		FourthExample fObj1 = new FourthExample();
		fObj1.division(20, 4);
		System.out.println("-----------------");
		FourthExample fObj2 = new FourthExample();
		fObj2.division(1, 0);
	}

}
