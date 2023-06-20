package com.demo.stringTokenizer;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer("Java has rich frameworks support");
		String a = st.nextToken();
		System.out.println(a);
	}

}
