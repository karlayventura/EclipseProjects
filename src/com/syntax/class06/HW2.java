package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		/*
		 * Write a program that will print whether it is a weekend or weekday. If -> any
		 * day from 1-5 → output “It is a weekday”, if else -> any day from 6-7 → output
		 * “It is a weekend”, else -> any other day → output “Invalid day”
		 */

		Scanner day = new Scanner(System.in);
		System.out.println("Please enter numerical value of today's day.");
		int whatDay = day.nextInt();

		if (whatDay >= 1 && whatDay <= 5) {
			System.out.println("It is a weekday.");
		} else if (whatDay == 7 || whatDay == 6) {
			System.out.println("It is weekend.");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("-------------------------------");

		if (whatDay >= 1 && whatDay <= 5) {
			System.out.println("It is a weekday.");
		} else if (whatDay >= 6 && whatDay <= 7) {
			System.out.println("It is weekend.");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("-------------------------------");

		if (whatDay == 1 || whatDay == 2 || whatDay == 3 || whatDay == 4 || whatDay == 5) {
			System.out.println("It is a weekday.");
		} else if (whatDay == 7 || whatDay == 6) {
			System.out.println("It is weekend.");
		} else {
			System.out.println("Invalid day");
		}

	}

}
