package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CopyOnWriteArraySet<Integer> cobj = new CopyOnWriteArraySet<Integer>();
		 cobj.add(1);
		 cobj.add(2);
		 cobj.add(3);
		 cobj.add(4);
		 cobj.add(5);
		 System.out.println(cobj);
	}

}
