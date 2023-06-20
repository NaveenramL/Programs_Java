package com.demo.utilConCurrentPackagePrograms;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDrainTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(100);
		abq.add("Java");
		abq.add("Hibernate");
		abq.add("Angular");
		abq.add("Spring");
		abq.add("Data Structures and Algorithms");
		
		System.out.println(abq);
		
		ArrayList<String> arrayList = new ArrayList<String>();
		abq.drainTo(arrayList);
		for(String a : arrayList) {
			System.out.println(a);
		}
		
	}

}
