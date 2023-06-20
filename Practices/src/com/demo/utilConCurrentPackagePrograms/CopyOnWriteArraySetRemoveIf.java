package com.demo.utilConCurrentPackagePrograms;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetRemoveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArraySet<String> cobj = new CopyOnWriteArraySet<String>();
		cobj.add("MicroServices");
		cobj.add("Docker");
		cobj.add("Kubernetes");
		cobj.add("Maven");
		cobj.add("Gradle");
		System.out.println(cobj);
		System.out.println("--------------");
		
		try {
		boolean a = cobj.removeIf(null);
		System.out.println(a);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
