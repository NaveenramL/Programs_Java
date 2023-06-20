package com.demo.conCurrentLinkedDeQue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConCurrentLinkedDeQuePeekLast {

	public static void main(String[] args) {
		
		//peek method retrieves but does not remove the last element of the queue represented
		//by this deque, returns null if deque is empty
		ConcurrentLinkedDeque<String> cObj = new ConcurrentLinkedDeque<String>();

		cObj.add("Java");
		cObj.add("Spring Framework");
		cObj.add("Hibernate");
		cObj.add("JUnit");
		cObj.add("Servlet");
		cObj.add("JSP");
		
		System.out.println(cObj);
		System.out.println("------------------");
		
		System.out.println(cObj.peekLast());

	}

}
