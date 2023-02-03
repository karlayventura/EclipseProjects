package com.syntax.class03;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and name it Temperature Check. 
		 * Create variable to store temperature. 
		 * Your program should check if temperature is below 32 then 
		 * it should print Water will freeze with temperature, 
		 * otherwise Water will NOT freeze with temperature
         */

		int temp = 23;
		
		if (temp < 32) {
			System.out.println("Water will freeze with temperature" +temp);
		}else {
			System.out.println("Water will NOT freeze with temperature" +temp );
		}
		
		/*
		 * Create Java program to store 2 values for expected and actual hours. 
		 * Your program should check if expected hours are more than actual the program
		 * should print "You will love the course and you will succeed" , 
		 * otherwise "Course will be very hard for you"
		 */
		
		int expHour=15;
		int actHour=20;
		
		if(expHour>actHour) {
			System.out.println("You will love the course and you will succeed");
		}else {
			System.out.println("Course will be very hard for you");
		}
		
	}

}
