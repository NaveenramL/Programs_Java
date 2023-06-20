package com.demo.fileHandlingWithCustomException;

public class ToCheckInt {

    public static int checkDataIsInt(String value) {
		String tempData=null;
		int integerData=0;;
		int number=value.length();
		for(int i=0;i<number;i++) {
			if(value.charAt(i)< '0' || value.charAt(i)>'9') {
				throw new NumberFormatException();
			}
			else {
				tempData=value;
			}
		}
		
		  try {
			  for(int i=0;i<value.length();i++)
		  {
		  
				  integerData = integerData *10 + tempData.charAt(i) - '0'; }
		  
		  }
		  catch(NumberFormatException nfe) 
		  { 
			  nfe.printStackTrace();
		  }
		 
		return integerData;
	}
}
