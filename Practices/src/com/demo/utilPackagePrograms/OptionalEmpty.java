package com.demo.utilPackagePrograms;

import java.util.Optional;

public class OptionalEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Optional<String> gender = Optional.of("MALE");
	        String answer1 = "Yes";
	        String answer2 = null;

	        System.out.println("Non-Empty Optional: " + gender);
	        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
	        System.out.println("Empty Optional: " + Optional.empty());

	        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
	        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
	        
	        System.out.println("------------------");
	        
		/*
		 * Optional<String> languages = Optional.of(null);
		 * System.out.println(languages.get());
		 */
	        // java.lang.NullPointerException
	        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
	}

}
