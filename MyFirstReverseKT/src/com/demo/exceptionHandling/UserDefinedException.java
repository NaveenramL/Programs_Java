package com.demo.exceptionHandling;

public class UserDefinedException {

	void employeeIDCheck(int id) throws CustomException{
		if(id < 0 || id>100) {
			throw new CustomException("Invalid Employee ID");
		}
	}
	
	public static void main(String[] args){
		UserDefinedException obj = new UserDefinedException();
		try {
			obj.employeeIDCheck(101);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
