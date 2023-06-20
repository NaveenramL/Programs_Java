package com.demo.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcurrentModificationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		list.add("Java");
		
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()) {
			if(itr.next()=="Java") {
				list.remove("Java");
			}
			System.out.println(itr1.next());
		}
	}

}
