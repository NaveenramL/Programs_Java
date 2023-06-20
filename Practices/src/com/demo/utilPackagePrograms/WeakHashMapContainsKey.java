package com.demo.utilPackagePrograms;

import java.util.WeakHashMap;

public class WeakHashMapContainsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeakHashMap<String, String> whp = new WeakHashMap<String,String>();
		whp.put("Java", "James Gosling");
		whp.put("Spring", "Rod Johnson");
		whp.put("C", "Dennis Ritchie");
		whp.put("C++", "Bjarne Stroustup");
		
		System.out.println(whp);
		
		boolean a = whp.containsKey("Java");
		System.out.println(a);
		
		boolean b = whp.containsKey("Hibernate");
		System.out.println(b);
	}

}
