package com.test.firstMCQTest;

public class TestProgramFourth {

	public int fact(int n){
		if(n==1)
		
		return 1;
		else
			return (n*fact(n-1)); // 5*fact(4) 
		//5*4*fact(3) 
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestProgramFourth tpf1 = new TestProgramFourth();
		System.out.println(tpf1.fact(5));
		tpf1.fact(5);
		
	}

}
