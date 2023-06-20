package com.threadsample;

public class ThreadSample extends Thread
{
	static int count = 10;
	// int count = 10;

	public void run()
	{
		System.out.println("Thread using Thread class ....");
		count++;
		System.out.println("Thread "+Thread.currentThread().getId()+" "+count);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		ThreadSample ts1 = new ThreadSample();
		ThreadSample ts2 = new ThreadSample();
		ts1.start();
		Thread.sleep(1000);
		ts2.start();
		
	}
}
