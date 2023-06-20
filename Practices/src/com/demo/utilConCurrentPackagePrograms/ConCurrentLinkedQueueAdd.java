package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConCurrentLinkedQueueAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
		clq.add(100);
		clq.add(200);
		clq.add(300);
		clq.add(400);
		clq.add(500);
		System.out.println(clq);
	}

}
