package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello " + i);
		}

		System.out.println("  MULTIPLICATION TABLE  ");

		/*
		 * 3 X 1 = 3 3 X 2 = 6 3 X 3 = 9
		 */

		int num = 3;
		int result;

		for (int i = 1; i <= 10; i++) {
			result = num * i;
			System.out.println(num + " X " + i + " = " + result);
		}

		System.out.println("-- WHAT IS THE OUTPUT --");

		for (int i = 0; i <= 10; i += 3) { // i+=3 is i+3
			System.out.println(i + " "); // 0,3,6,9
		}

		System.out.println("-- WHAT IS THE OUTPUT --");

		int sum = 0;// 1,3,6,10,15

		for (int i = 1; i <= 5; i++) {
			sum += i; // sum=sum+i; 0+1 = 1+2 = 3+3 = 6+4 = 10+5 = 15 total
			System.out.println(sum); // 15
		}

		System.out.println("-- WHAT IS THE OUTPUT --");

		int value = 1;

		for (int i = 1; i < 4; i++) {
			value *= i; // 1x1 = 1x2 = 2x3 = 6
		}
		System.out.println(value);

		/*
		 * I want to find out the sum of all even and all odd numbers from the range 1
		 * to 50
		 */

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) { // Adding all even numbers together 0+2 = 2+4 = 6+6 = 12
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i; // Adding all odd numbers together 0+1 = 1+3 = 4+5 = 9
			}
		}
		System.out.println("The sum of all evev numbers = " +sumEven +" and the sum of all odd numbers = " +sumOdd);

		
	
	
	
	
	
	}
}
