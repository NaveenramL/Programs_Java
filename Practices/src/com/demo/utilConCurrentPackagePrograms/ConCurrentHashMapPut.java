package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("Name", "Naveenram");
		chm.put("Course", "Java");
		chm.put("City", "Villupuram");
		
		System.out.println(chm);
	}

}
