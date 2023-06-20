package com.demo.assignment;
/*This program is compiled and run in Java 1.8
 *this is a simple addition program using oops concept*/
public class MathUtil {

	private int i;
	private int j;
	private int sum;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void add() {
		sum = getI()+getJ();
		setSum(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathUtil mu = new MathUtil();
		mu.setI(10);
		mu.setJ(20);
		mu.add();
		System.out.println(mu.getSum());
	}

}
