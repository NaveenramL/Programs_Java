package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArraySet<String> cobj = new CopyOnWriteArraySet<String>();
		cobj.add("SpringMVC");
		cobj.add("SpringBoot");
		cobj.add("SpringREST");
		cobj.add("Spring Security");
		System.out.println(cobj);
		System.out.println("------------");
		
		Object[] elements=cobj.toArray();
		for(Object a : elements) {
			System.out.println(a);
		}

	}

}
