package com.demo.conCurrentLinkedDeQue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConCurrentLinkedDeQueToArray {

	public static void main(String[] args) {
		
		ConcurrentLinkedDeque<String> cObj = new ConcurrentLinkedDeque<String>();
		cObj.add("MicroServices");
		cObj.add("Docker");
		cObj.add("Kubernetes");
		cObj.add("LDAP");
		cObj.add("OAuth");
		System.out.println(cObj);
		System.out.println("-------------");
		
		Object[] a=cObj.toArray();
		for(Object elements : a) {
			System.out.println(elements);
		}

	}

}
