package com.demo.fileHandlingAssignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DemoMain {
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		List<Student> student = new ArrayList<Student>();
		//Student2 student = new Student2();
		
		File outputfile = new File("c:\\users\\navee\\desktop\\2_File_Output.txt");
		
		FileReader reader = new FileReader("c:\\users\\navee\\desktop\\2_File_Input.txt");
		
		BufferedReader br = new BufferedReader(reader);

		FileWriter fw = new FileWriter(outputfile);
		
		String s=null;
		//ArrayList<String> data = new ArrayList<String>();
		
		while((s=br.readLine())!=null) 
		{
			int i=1;   boolean tempData=false;
			boolean tempData2=false;
			boolean tempData3=false;
			//John,89,65,72,56,34,98,55,23,89
			Student studentobj = new Student();
			Semester sem1 = new Semester();
			Semester sem2 = new Semester();
			Semester sem3 = new Semester();
			
			int m1,m2,m3,m4,m5,m6,m7,m8,m9;
			int[] sem1Marks=new int[3];  
			int[] sem2Marks=new int[3];
			int[] sem3Marks=new int[3];
			
			int d3=-1;
			int d2=-1;
			int d1=-1;
			int d4=-1;
			int d5=-1;
			int d6=-1;
			int d7=-1;
			int d8=-1;
			int d9=-1;
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
					  try{
						  d1 = Integer.parseInt(data); 
					  }catch(Exception e1) {
						  tempData=true;
					  }
					  
					  sem1.setNum(1);
					  m1=d1;
					  sem1Marks[0] = m1;
				  }
				  else if(i==3) 
				  {
					  try {
						  d2= Integer.parseInt(data);
					  }catch(Exception e2) {
						  tempData=true;
					  }
				  
					m2=d2;
					sem1Marks[1]=m2;
				  }
				  else if(i==4)
				  {
		              try {
		            	   d3 =Integer.parseInt(data);
						/*
						 * m3=d3; sem1Marks[2]=m3;
						 */
		            	  }
		              catch(Exception e) 
		              {
		            	  tempData=true;
						/*
						 * m3=-1; sem1Marks[2]=m3;
						 */
		              }
		             m3=d3;
		             sem1Marks[2]=m3;
		              
		              }
				  else if(i==5)
				  {
					  try {
						  d4 = Integer.parseInt(data);  
					  }catch(Exception e3) {
						  tempData2=true;
					  }
					  
					  sem2.setNum(2);
					  m4=d4;
					  sem2Marks[0]=m4;
				  }
				  else if(i==6)
				  {
					  try {
						  d5 = Integer.parseInt(data); 
					  }catch(Exception e4) {
						  tempData2=true;
					  }
					  
					  m5=d5;
					  sem2Marks[1]=m5;
				  }
				  else if(i==7)
				  {
					  try {
						  d6 = Integer.parseInt(data); 
					  }catch(Exception e5) {
						  tempData2=true;
					  }
					  
					  m6=d6;
					  sem2Marks[2]=m6;
				  }
				  else if(i==8)
				  {
					  try {
						  d7 =Integer.parseInt(data); 
					  }catch(Exception e6) {
						  tempData3=true;
					  }
					  sem3.setNum(3);
					  m7=d7;
					  sem3Marks[0]=m7;
				  }
				  else if(i==9)
				  {
					 try {
						 d8 = Integer.parseInt(data);
					 }catch(Exception e7) {
						 tempData3=true;
					 }
					  
					  m8=d8;
					  sem3Marks[1]=m8;
				  }
				  else if(i==10)
				  {
					 try {
						 d9=Integer.parseInt(data); 
					 }catch(Exception e8) {
						 tempData3=true;
					 }
					 
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
			
	
			String semDetails = null ;
			if(!tempData) {
				float sem1Average = ((float)sem1Marks[0]+(float)sem1Marks[1]+(float)sem1Marks[2])/3;
				sem1.setAverage(sem1Average);
				semDetails=" SEM-1 AVG : "+sem1.getAverage();
			}
			else
			{
				semDetails="SEM-1 INVALID MARKS";
			}
			
			String sem2Details=null;
			if(!tempData2) {
				float sem2Average = ((float)sem2Marks[0]+(float)sem2Marks[1]+(float)sem2Marks[2])/3;
				sem2.setAverage(sem2Average);	
				sem2Details=" SEM-2 AVG : "+sem2.getAverage();
			}
			else {
				sem2Details="SEM-2 INVALID MARKS";
			}
			
			String sem3Details = null;
			if(!tempData3) {
				float sem3Average = ((float)sem3Marks[0]+(float)sem3Marks[1]+(float)sem3Marks[2])/3;
				sem3.setAverage(sem3Average);
				sem3Details=" SEM-2 AVG : "+sem3.getAverage();
			}
			else {
				sem3Details="SEM-3 INVALID MARKS";
			}
			
			
			
			studentobj.setSemester(semesters);
			String outputString = studentobj.getName()+" , "+semDetails+" , "+sem2Details+" , "+sem3Details+"\n";
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
