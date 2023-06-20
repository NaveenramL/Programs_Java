package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListAddIfAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<String> cobj = new CopyOnWriteArrayList<String>();
		cobj.add("Inheritance");
		cobj.add("Abstraction");
		cobj.add("Polymorphism");
		cobj.add("Aggregation");
		cobj.add("Composition");
		System.out.println(cobj);
		System.out.println("--------------");
		
		boolean a = cobj.addIfAbsent("Aggregation");
		System.out.println(a);
		System.out.println(cobj);
		System.out.println("--------------");
		
		boolean b = cobj.addIfAbsent("Constructors");
		System.out.println(b);
		System.out.println(cobj);
		System.out.println("--------------");
		
	}

}
