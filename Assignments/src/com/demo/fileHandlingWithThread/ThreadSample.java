package com.demo.fileHandlingWithThread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class ThreadDemo  extends Thread {
	 static  int index=0;
	//static String a = null;	
	
	ThreadDemo() throws Exception{
		
	}
	
	 File outputfile = new File("c:\\users\\navee\\desktop\\Display_File_Output.txt");
	
	
	 FileWriter fw = new FileWriter(outputfile);
	
	public void run() {
	printDetails();	
	
		
		  try { 
			  fw.write("This is line number : "+index);
			   
			  }
		  catch (IOException e) 
		  { // TODO Auto-generated catch block
		  e.printStackTrace();
		  }
	}

	
	public  static synchronized void printDetails()  {
		index++;
		System.out.println("This is line number : "+index);
		
		/* a = "This is line number : "+index; */
		
		/*
		 * File outputfile = new
		 * File("c:\\users\\navee\\desktop\\Display_File_Output.txt"); FileWriter fw =
		 * new FileWriter(outputfile); fw.write("This is line number : "+index);
		 * fw.flush(); fw.close();
		 */
		 
	}
	
}




public class ThreadSample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//File outputfile = new File("c:\\users\\navee\\desktop\\Display_File_Output.txt");
		
		//FileWriter fw = new FileWriter(outputfile);
		
		for(int i=0;i<5;i++) {
			ThreadDemo td1 = new ThreadDemo();
		    td1.start();
		    
		}

	}

}
