package com.syntax.class05;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card? Please answer with yes/no");
		String creditCard = scan.next();

		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance of your credit card?");

			double balance = scan.nextDouble();
			
			if (balance > 1000) {
				System.out.println("Pay off the $" + balance + " immediately");
			} else {
				System.out.println("You can spend more!");
			}
		
		} else {
			System.out.println("Would you like to sign up for a credit card?");
		}

	}

}
