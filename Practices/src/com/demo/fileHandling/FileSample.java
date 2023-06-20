package com.demo.fileHandling;

import java.io.*;
public class FileSample {

	public static void main(String[] args) {
		
		/*Created a source file to write a text*/
		File file = new File("c:\\users\\navee\\desktop\\test.txt");
		
		/*Created a destination file ,to copy text from 'test' file*/
		File ofile = new File("c:\\users\\navee\\desktop\\mrtest.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File Created : "+file);
			}
			
			/*It is used to write text into a file, which is in our case
			 * 'test' file*/
			FileWriter writer = new FileWriter(file);
			writer.write("Naveen \n");
			writer.write("Ram \n");
			writer.write("LR \n");
			writer.close();
			
			//FileInputStream fistream = new FileInputStream(file);
			//FileOutputStream fostream = new FileOutputStream(ofile);
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			/*To copy and write the contents into 'mrtest' file, from
			 * 'test' file*/
			FileWriter fw = new FileWriter(ofile);
			
			String s = null;
			while((s=br.readLine())!=null) {
				fw.write("Mr. "+s+"\n");
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
