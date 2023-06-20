package com.demo.fileHandlingWithThread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileThreadSample1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		File writefile = new File("c:\\users\\navee\\desktop\\Display7_File_Output.txt");
		BufferedWriter brw
		= new BufferedWriter(new FileWriter(writefile));
		Object o = new Object();
		for(int index=0; index<5; index++) {
			FilePrintThread p1 = new FilePrintThread(brw);
			p1.start();
			//Thread.sleep(1000);
			p1.join();
		}
		brw.close();
	}
}

