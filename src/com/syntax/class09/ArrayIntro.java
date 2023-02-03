package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num = 1;
		//Creating an array that holds 4 elements
		int[] numbers = new int [4];
		//Storing values/element inside an array index
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		// adding + Performs addition
		System.out.println(numbers[3]+numbers[0]);
		
		// 
		String[] countries = new String[5];
		
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		// adding + Performs string concatenation
		System.out.println(countries[3]+countries[4]);
		
		String[] names = new String[5];
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		
		System.out.println(names[1]);// Orsan
		System.out.println("Value in index 0 is = "+names[0]);
		
		names[1]="Daniyar"; // reassign to new name
		System.out.println(names[1]);
		
		//Create an array to store 4 different prices
		//Find an average of how much we spent
		
		double[] prices = new double[4];
		prices[0]=0.99;
		prices[1]=1.99;
		prices[2]=2.99;
		prices[3]=3.99;
		
		double avg=(prices[0]+prices[1]+prices[2]+prices[3])/4; //Store in a variable
		System.out.println(avg);
		

	
	}
}
