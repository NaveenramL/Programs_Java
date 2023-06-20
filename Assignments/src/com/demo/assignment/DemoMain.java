package com.demo.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*This program is compiled and run in Java 1.8
 * This program reads an input text file which consists of Student names,
 * along with his/her three semester marks. Each semester consists of three subject marks.
 * Name and each marks are separated by comma(,)*
 * Sample Input -----> Naveen,89,65,72,56,34,98,55,23,89  
 * here Naveen is name of the student
 * here 89,65,72 are first semester marks,
 * 56,34,98 are second semester marks,
 * 55,23,89 are third semester marks.
 * 
 * Output of this program is it will create an output text file and 
 * write the name of the student and average of his/her three semester marks separated by comma(,)
 * 
 *  Sample Output -----> Naveen , SEM1-AVG : 75.333336 ,  SEM-2 AVG : 62.666668 ,  SEM-3 AVG : 55.666668
 * */

public class DemoMain {
	
	
	public static void main(String[] args) throws Exception{
		
		
		List<Students> student = new ArrayList<Students>();
		//Student2 student = new Student2();
		
		File outputfile = new File("c:\\users\\navee\\desktop\\File_Assign2_output.txt");
		
		FileReader reader = new FileReader("c:\\users\\navee\\desktop\\File_Assign2_input.txt");
		
		BufferedReader br = new BufferedReader(reader);

		FileWriter fw = new FileWriter(outputfile);
		
		String s=null;
		//ArrayList<String> data = new ArrayList<String>();
		
		while((s=br.readLine())!=null) 
		{
			int i=1;
			//John,89,65,72,56,34,98,55,23,89
			Students studentobj = new Students();
			Semester sem1 = new Semester();
			Semester sem2 = new Semester();
			Semester sem3 = new Semester();
			
			int m1,m2,m3,m4,m5,m6,m7,m8,m9;
			int[] sem1Marks=new int[3];  
			int[] sem2Marks=new int[3];
			int[] sem3Marks=new int[3];
			
			StringTokenizer st = new StringTokenizer(s, ",");
			while(st.hasMoreTokens())
			{
				
				  String data = st.nextToken(); 
				  if(i==1) 
				  { 
					  studentobj.setName(data);
				  } 
				  else if(i==2)
				  {
					  int d1 = Integer.parseInt(data);
					  sem1.setNum(1);
					  m1=d1;
					  sem1Marks[0] = m1;
				  }
				  else if(i==3) 
				  {
					int d2= Integer.parseInt(data);
					m2=d2;
					sem1Marks[1]=m2;
				  }
				  else if(i==4)
				  {
					  int d3 =Integer.parseInt(data);
					  m3=d3;
					  sem1Marks[2]=m3;
				  }
				  else if(i==5)
				  {
					  int d4 = Integer.parseInt(data);
					  sem2.setNum(2);
					  m4=d4;
					  sem2Marks[0]=m4;
				  }
				  else if(i==6)
				  {
					  int d5 = Integer.parseInt(data);
					  m5=d5;
					  sem2Marks[1]=m5;
				  }
				  else if(i==7)
				  {
					  int d6 = Integer.parseInt(data);
					  m6=d6;
					  sem2Marks[2]=m6;
				  }
				  else if(i==8)
				  {
					  sem3.setNum(3);
					  int d7 =Integer.parseInt(data);
					  m7=d7;
					  sem3Marks[0]=m7;
				  }
				  else if(i==9)
				  {
					  int d8 = Integer.parseInt(data);
					  m8=d8;
					  sem3Marks[1]=m8;
				  }
				  else if(i==10)
				  {
					  int d9=Integer.parseInt(data);
					  m9=d9;
					  sem3Marks[2]=m9;
				  }
				i++; 
				
			}	
			
			sem1.setMarks(sem1Marks);
			sem2.setMarks(sem2Marks);
			sem3.setMarks(sem3Marks);
			
			List<Semester> semesters = new ArrayList<Semester>();
			semesters.add(sem1);
			semesters.add(sem2);
			semesters.add(sem3);
			
	
			
			float sem1Average = ((float)sem1Marks[0]+(float)sem1Marks[1]+(float)sem1Marks[2])/3;
			sem1.setAverage(sem1Average);
			
			float sem2Average = ((float)sem2Marks[0]+(float)sem2Marks[1]+(float)sem2Marks[2])/3;
			sem2.setAverage(sem2Average);
			
			float sem3Average = ((float)sem3Marks[0]+(float)sem3Marks[1]+(float)sem3Marks[2])/3;
			sem3.setAverage(sem3Average);
			
			
			studentobj.setSemester(semesters);
			String outputString = studentobj.getName()+" , "+"SEM1-AVG : "+sem1.getAverage()+" , "+" SEM-2 AVG : "+sem2.getAverage()+" , "+" SEM-3 AVG : "+sem3.getAverage()+"\n";
			System.out.println(outputString);
			fw.write(outputString);
			/*
			 * studentobj=null; System.out.println(semesters);
			 */
		}
		fw.flush();
		fw.close();
		//System.out.println(data);
		
	}

}
