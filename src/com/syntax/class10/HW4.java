package com.syntax.class10;

public class HW4 {

	public static void main(String[] args) {

		// From an array of integer elements find the largest number.

		int[] number = { 100, 45, 100, 32 }; // 1. Creating array of integer

		int largest = number[0]; // 1. Initalizing the largest number to 1 of the index of array

		for (int n = 1; n < number.length; n++) {

			if (number[n] > largest) { // Comparing each number to largest
				largest = number[n]; // Reassigning the largest number to the actual largest number
			}

		}
		
		System.out.println(largest);
		
		largest = number[0];
		
		for (int num:number) {
			
			if (num > largest) {
				largest=num;
			}
		}
		System.out.println(largest);

	}
}
