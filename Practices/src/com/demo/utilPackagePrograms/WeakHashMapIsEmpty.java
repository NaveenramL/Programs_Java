package com.demo.utilPackagePrograms;

import java.util.WeakHashMap;

public class WeakHashMapIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeakHashMap<String, String> whp = new WeakHashMap<String,String>();
		whp.put("Java", "James Gosling");
		whp.put("Spring", "Rod Johnson");
		whp.put("C", "Dennis Ritchie");
		whp.put("C++", "Bjarne Stroustup");
		
		System.out.println(whp);
		
		boolean a =whp.isEmpty();
		System.out.println(a);
		
		WeakHashMap<String, String> whp1 = new WeakHashMap<String,String>();
		boolean b = whp1.isEmpty();
		System.out.println(b);
	}

}
