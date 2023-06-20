package com.demo.javaExamples;

public class FinalVariableExample {

	final int age=26;
	
	void setAge() {
	//	age=27;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalVariableExample fve1 = new FinalVariableExample();
		//fve1.age=10;
		System.out.println(fve1.age);
	}

}
