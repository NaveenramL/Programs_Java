package com.samplejava;

public class Sample1 
{
	private volatile int counter = 0;   
	public int getCounter()   
	{  
	return counter;  
	}  
	public void increaseCounter()   
	{  
	++counter;        
	} 
}
