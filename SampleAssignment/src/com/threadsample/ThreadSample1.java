package com.threadsample;

public class ThreadSample1 implements Runnable
{
    int count = 1; 
	
	@Override
	public void run() 
	{
		
	    System.out.println("Using Runnable Interface ....");	
	}

	public static void main(String[] args) 
	{
	
		ThreadSample1 th1 = new ThreadSample1();
		ThreadSample1 th2 = new ThreadSample1();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
	}
}
