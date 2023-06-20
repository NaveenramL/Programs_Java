package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuePoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(100);
		abq.add(1);
		abq.add(100);
		abq.add(400);
		abq.add(1000);
		abq.add(9000);
		
		System.out.println(abq);
		System.out.println("------------");
		
		abq.poll();
		System.out.println(abq);
		System.out.println("------------");
		
		ArrayBlockingQueue<Integer> abq1 = new ArrayBlockingQueue<Integer>(100);
		System.out.println(abq1.poll());
	}

}
