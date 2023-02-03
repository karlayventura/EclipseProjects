package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		
		/* Create a secret number
		 * 
		 * We want user to guess our secret number
		 * 
		 * The moment user guessed my secret number -> program should stop
		 * Otherwise -> it should continue asking to guess secret number
		 * 
		 */
		
		int secretNumber = 12;
		Scanner scan = new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter secret number to win");
			guessNumber = scan.nextInt();
		
		}while(guessNumber != secretNumber);
		
		System.out.println("Congratulations");

	
	
	
	
	
	
	
	
	}
}
