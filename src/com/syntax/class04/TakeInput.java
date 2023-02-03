package com.syntax.class04;
/*
 * To Auto import scanner: Mac = cmd+shift+o
 *                     Windows = ctrl+shift+o
 */
import java.util.Scanner;


public class TakeInput {

	public static void main(String[] args) {

		//Step 1. Create a Scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		
		//Step 2. Specify instructions
		System.out.println("Please enter the country where you are from");
		
		//Step 3. We need to capture a string value -> use next();
		String country=scan.next();
		System.out.println("You are from " +country);
		
		//if you are from USA = You speak english
		//if you are from FRANCE = You speak french
		
		if(country.equalsIgnoreCase("USA")) {
			System.out.println("You speak english");
		}else if (country.equalsIgnoreCase("France")) {
			System.out.println("You speak french");
		}else if (country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak turkish");
		}else {
			System.out.println("I dont know which language you speak");
		}
			
	
		

	}

}
