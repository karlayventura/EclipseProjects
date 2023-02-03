package com.syntax.class10;

public class HW {

	public static void main(String[] args) {

		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array
		 * 
		 */

		String[] cars = { "Mercedes", "BMW", "Bentley", "Porche", "jaguar", "Range Rover" };

		// FOR LOOP
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}

		System.out.println("-----------------------------------------");

		// FOR EACH LOOP
		for (String car : cars) {
			System.out.print(car + " ");
		}

	}
}
