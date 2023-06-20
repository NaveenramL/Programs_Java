package com.demo.javaExamples;

public class AnonymousImpl {

	public static void main(String[] args) {
		
		Anonymous a = new Anonymous() {
			
			@Override
			public void printMsg() {
				
				System.out.println("This is an example of Anonymous Class....");
				
			}
		};
	a.printMsg();
	}
	
	
}
