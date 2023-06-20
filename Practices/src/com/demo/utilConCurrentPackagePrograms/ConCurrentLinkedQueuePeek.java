package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConCurrentLinkedQueuePeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentLinkedQueue<String> clq = new ConcurrentLinkedQueue<String>();
		clq.add("Java");
		clq.add("C");
		clq.add("C++");
		clq.add("JavaScript");
		clq.add("Angular");
		clq.add("Hibernate");
		System.out.println(clq);
		System.out.println("---------------");
		
		
		System.out.println(clq.peek());
	}

}
