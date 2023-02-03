package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		/*
		 * Declare a variable to store a price for a coffee. 
		 * Ask user to pay for a coffee. Keep asking to pay for coffee until user enters exact amount.
		 * If user give more than price --> ask them to give less.
		 * If user gives less than price --> ask them to give more.
		 * Once user got a write amount print "Please enjoy your coffee"
		 */

	
	double price = 2.99;
	System.out.println("Please pay for your coffee");
	
	Scanner in = new Scanner(System.in);
	double pay ;
	
	do {
		pay = in.nextDouble();
		if(pay>=3){
			System.out.println("Please give less");
			
		}else if(pay<3) {
			System.out.println("Please give more money");
			
		}
		
	}while(pay!=2.99);
	System.out.println("Please enjoy your coffee");
	
	
	
	
	
	}
}
