package com.demo.utilPackagePrograms;

import java.util.PriorityQueue;

public class PriorityQueueSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.add("a");
		
		System.out.println(pq);
		
       int a =pq.size();
       System.out.println(a);
	}

}