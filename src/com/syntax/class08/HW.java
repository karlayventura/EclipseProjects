package com.syntax.class08;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		/*
		 * Ask a user to enter first name, last name and age 5xtimes.
		 * Every time your program should print those values in a format
		 * "Your name is __ and you are __ years old"
		 * 
		 */

	Scanner scan = new Scanner(System.in);
	
	for(int i = 0; i<5; i++) {
	
	System.out.println("Please enter your name");
	String name = scan.nextLine();
	
	System.out.println("Please enter your last name");
	String lName = scan.nextLine();
	
	System.out.println("Please enter your age");
	int age = scan.nextInt();
	
	scan.nextLine();	
	System.out.println("Your name is " +name +" " +lName + " and you are " +age +" years old.");
	
	}
	
	
	}
}
