package com.demo.conCurrentLinkedDeQue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConCurrentLinkedDeQueClear {

	public static void main(String[] args) {
		
		// clear method removes all the elements from this deque
		// isEmpty method checks whether this deque is empty or not.
		// Returns true if it has no elements, else returns false
		ConcurrentLinkedDeque<String> cObj = new ConcurrentLinkedDeque<String>();

		cObj.add("Java");
		cObj.add("Spring Framework");
		cObj.add("Hibernate");
		cObj.add("JUnit");
		cObj.add("Servlet");
		cObj.add("JSP");
		
		System.out.println(cObj);
		System.out.println("------------------");
		
		cObj.clear();
		System.out.println(cObj);
		System.out.println("------------------");
		boolean a = cObj.isEmpty();
		System.out.println(a);
	}

}
