package com.demo.conCurrentLinkedDeQue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConCurrentLinkedDeQueAdd {

	public static void main(String[] args) {
		
		// add method adds the specified element at the tail of the dequeue
		ConcurrentLinkedDeque<Integer> cObj = new ConcurrentLinkedDeque<Integer>();
		cObj.add(1);
		cObj.add(2);
		cObj.add(3);
		cObj.add(4);
		cObj.add(5);
		
		System.out.println(cObj);

	}

}
