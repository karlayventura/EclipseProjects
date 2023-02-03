package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * "The temperature is the city __ is __"
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your city: ");
		String city = input.nextLine();
		;
		
		System.out.println("Please enter your temperature ");
		int farenheight, celesius;
		farenheight = input.nextInt();
		
		celesius = ((farenheight - 32) * 5) / 9;
		
		System.out.println("The temperature in " + city + " is " + celesius);
		
		
	}

}
