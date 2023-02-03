package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {
		
		/* Create an array on int and calculate the sum of all elements in array
		 */
		
		int [] numbers = {15, 45, 10, 32}; // 1. Create an array of integers
		
		int size = numbers.length; // 2. Creating a variable to initiate the size of array
		int sum = 0; // 3. Creating a variable for a sum+ and initizing it.
		
		for (int i = 0; i < size; i++) { // 3. Using FOR LOOP.
			sum += numbers[i];
		}
		
		System.out.println("Sum of all elements in the array = " +sum);

		System.out.println("------------------------------------------");
		
		sum=0; // 2. Initalize sum to a variable.
		
		for (int num : numbers) { // 3. Using FOR EACH LOOP.
			sum+=num;
		}
		System.out.println("Sum of all elements in the array = " +sum);
		
	
	}
}
