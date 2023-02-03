package com.syntax.class05;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 3 different numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is the largest number");
			} else {
				System.out.println(num3 + " is the largest number");
			}
	 
	 } else { // num2 is larger than number 1
			if (num2 > num3) {
				System.out.println(num2 + " is the largest number");
			} else {
				System.out.println(num3 + " is the largest number");
			}
		}

	}

}
