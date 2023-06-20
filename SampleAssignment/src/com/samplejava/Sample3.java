package com.samplejava;

public class Sample3 
{

	private final static int noOfThreads = 2;  
	
	public static void main(String[] args) throws InterruptedException  
	{
		// TODO Auto-generated method stub
		
		Sample1 sample1 = new Sample1();
		
		Thread[] threads = new Thread[noOfThreads]; 
		
		for(int i=0;i<noOfThreads;++i)
		{
			threads[i] = new Sample2(sample1);  
		}

		for(int i = 0; i < noOfThreads; ++i)  
		{
			threads[i].start();    
		}
		
		for(int i = 0; i < noOfThreads; ++i) 
		{
			threads[i].join();  
		}
		}

}
