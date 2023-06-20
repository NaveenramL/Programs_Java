package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<Integer> cobj = new CopyOnWriteArrayList<Integer>();
		cobj.add(1);
		cobj.add(2);
		cobj.add(3);
		cobj.add(4);
		cobj.add(5);
		
		System.out.println(cobj);
	}

}
