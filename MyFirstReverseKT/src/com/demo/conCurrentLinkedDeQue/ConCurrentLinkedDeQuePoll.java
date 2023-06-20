package com.demo.conCurrentLinkedDeQue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConCurrentLinkedDeQuePoll {

	public static void main(String[] args) {
		
		// Poll method retrieves and removes the head of the queue represented by this deque
		//Returns null if this deque is empty.
		ConcurrentLinkedDeque<String> cObj = new ConcurrentLinkedDeque<String>();

		cObj.add("Java");
		cObj.add("Spring Framework");
		cObj.add("Hibernate");
		cObj.add("JUnit");
		cObj.add("Maven");
		cObj.add("Gradle");
		System.out.println(cObj);
		System.out.println("------------------");
		
		System.out.println(cObj.poll());
		System.out.println("------------------");
		System.out.println(cObj);
		

	}

}
