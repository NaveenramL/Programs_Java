package com.demo.fileHandlingWithThread;

import java.io.BufferedWriter;
import java.io.IOException;


	public class FilePrintThread extends Thread{
		static int index=0;
		static BufferedWriter brw;
		
		FilePrintThread(BufferedWriter brw){
			this.brw = brw;
		}
		
		public void run()
		{
			print2();
		}
		
		
		public static void print2()  {
			synchronized(FilePrintThread.class) {
				++index;
				System.out.println(index);
				try {
					brw.write("This is Line number " + index + "\n");
					brw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		

	}

