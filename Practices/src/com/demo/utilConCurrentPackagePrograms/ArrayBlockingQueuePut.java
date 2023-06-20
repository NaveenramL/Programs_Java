package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuePut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(100);
		abq.add(1);
		abq.add(100);
		abq.add(400);
		abq.add(1000);
		abq.add(9000);
		
		System.out.println(abq);
		System.out.println("--------------");
		try {
			abq.put(777);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(abq);
		System.out.println("----------");
		
		ArrayBlockingQueue<Integer> abq1 = new ArrayBlockingQueue<Integer>(5);
		abq1.add(1);
		abq1.add(2);
		abq1.add(3);
		abq1.add(4);
		abq1.add(5);
		System.out.println(abq1);
		System.out.println("---------------------");
		
		try {
			abq1.put(6);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(abq1);
	}

}
