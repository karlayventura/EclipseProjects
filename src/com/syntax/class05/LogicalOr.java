package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "Monday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}

		System.out.println("Code outside of if statement");

		/*
		 * Lets ask user what is today's day Based on the day lets define which class we
		 * have
		 * 
		 * if (monday or friday) -----> There is no class today else if (tuesday or
		 * wednesday) -> manual class else if (thursday) -------------> review class
		 * else if (saturday or sunday) ---> java class
		 *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day");
		day = scan.nextLine();

		if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class");
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("There is manual testing class");
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("There is review class");
		} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("There is java programming class");
		} else {
			System.out.println("INVALID ENTRY");
		}

	}

}
