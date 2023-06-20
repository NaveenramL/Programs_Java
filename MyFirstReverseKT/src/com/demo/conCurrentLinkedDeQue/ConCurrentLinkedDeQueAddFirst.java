package com.demo.conCurrentLinkedDeQue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConCurrentLinkedDeQueAddFirst {

	public static void main(String[] args) {

		// add method adds the specified element at the front of the dequeue
		ConcurrentLinkedDeque<Integer> cObj = new ConcurrentLinkedDeque<Integer>();
		cObj.add(1);
		cObj.add(2);
		cObj.add(3);
		cObj.add(4);
		cObj.add(5);
		
		System.out.println(cObj);
		System.out.println("-----------------------");
		
		cObj.addFirst(6);
		System.out.println(cObj);

	}

}
