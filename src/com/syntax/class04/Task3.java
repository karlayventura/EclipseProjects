package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and call it a Donor.
		 * In order to be eligible to donate your blood you have to be 18 years old or older.
		 * Also once you identify age eligibility then we have to see if person matches weight requirements. 
		 * If person weight it more than 110 lbs → then he/she is eligible.
		 * otherwise we cannot accept such a patient.
		 * 
		 */

		int age=18;
		int weight=122;
		
		if(age>=18) {
			System.out.println("Your are eligible let's check weight");
		
			if(weight>=110) {
				System.out.println("You are eligible to donate the blood");
			}else {
				System.out.println("Sorry you are not eligible to donate");
			}
		
		}else {
			System.out.println("You are not eligible by age");
		}
		
		System.out.println("------------------------------");
		
	/*Else block cannot exist by itself
	 * else{
	 *    System.out.println("condition is false");
	 * }
	 */
	
		
	}

}
