package com.demo.stringTokenizer;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Java is a high level programming language.");
		
		boolean a = st.hasMoreElements();
		System.out.println(a);
		
		StringTokenizer st1 = new StringTokenizer("");
		boolean b = st1.hasMoreElements();
		System.out.println(b);
	}
}
