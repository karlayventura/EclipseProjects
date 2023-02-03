package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D' };
		
		//How many elements inside array?
		int size=grades.length; //4
		System.out.println("Numbers of elements is = " +size);
		
		/* System.out.println(grades[1]);
		   System.out.println(grades[2]);
		   System.out.println(grades[3]);
		*/
		
		//To eliminate repetive code use --> Loops
		
		for (int i = 0; i<grades.length; i++) {
			System.out.print(grades[i] +" ");
		}
		
		System.out.println("--------------------------------------------");

		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		// if value is miami --> I want to live in miami
		
		for (int a=0; a<cities.length; a++) {
			System.out.println(cities[a]+"   ");
			
			if(cities[a].equals("Miami")) {
				System.out.println("I want to live in Miami");
			}
		}
		
		
		
	}
}
