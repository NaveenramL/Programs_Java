package com.samplejava;

public class Sample extends Thread
{

	int count =3;
	
	public void run()
	{
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+" is running "+(count+1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

public static void main(String[] args) 
{
	Sample s = new Sample();
	Sample s1 = new Sample();
	
	try{
		s.start();
		s.join();
		s1.start();
		s1.join();
	}
	catch(Exception e1) {
		e1.printStackTrace();
	}
}

}
