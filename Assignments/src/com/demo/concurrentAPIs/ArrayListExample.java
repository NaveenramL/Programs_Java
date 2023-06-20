package com.demo.concurrentAPIs;

import java.util.ArrayList;

public class ArrayListExample /* extends Thread */{

	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	/*
	 * public void run() { for(int i=0;i<50;i++) { list.add(i); }
	 * System.out.println(list); }
	 * 
	 * 
	 * 
	 * public Runnable removeElements() { list.removeAll(list);
	 * //System.out.println(list); return null; }
	 * 
	 * public static void main(String[] args) { ArrayListExample listobj =new
	 * ArrayListExample(); ArrayListExample listobj1 =new ArrayListExample(); Thread
	 * t1 = new Thread(listobj); Thread t2 = new Thread(listobj1.removeElements());
	 * 
	 * t1.start(); t2.start();
	 * 
	 * 
	 * }
	 */
}
