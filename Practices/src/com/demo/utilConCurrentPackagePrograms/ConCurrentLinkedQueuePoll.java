package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConCurrentLinkedQueuePoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentLinkedQueue<String> clq = new ConcurrentLinkedQueue<String>();
		clq.add("Java Swing");
		clq.add("Java AWT");
		clq.add("JavaFx");
		clq.add("JSF");
		clq.add("JSP");
		System.out.println(clq);
		System.out.println("-------------");
		
		System.out.println(clq.poll());
		System.out.println("-------------");
		
		System.out.println(clq);
	}

}
