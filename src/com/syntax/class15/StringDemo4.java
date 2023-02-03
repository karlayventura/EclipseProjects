package com.syntax.class15;

public class StringDemo4 {

	public static void main(String[] args) {
		
		// .substring(0);
		
		String name = "111-222-1234";
		// Start point is index 8 = Will print out ALL index after start point 1234
		System.out.println(name.substring(8)); 
		// (Start point index 4) & (End point index 7) = Will print out index 4,5,6 ONLY 222
		System.out.println(name.substring(4, 7)); 

		
		
		
		
	}
}
