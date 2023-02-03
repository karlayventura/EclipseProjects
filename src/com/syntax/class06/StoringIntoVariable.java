package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {
		
         Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		int quizScore = scan.nextInt();
		
		System.out.println("Please enter your mid-term score");
		int midtermScore = scan.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore = scan.nextInt();
		
		int score = (quizScore + midtermScore + finalScore) /3;
		
		char grade;
		
		if(score >= 90) {
			grade='A';
		}else if (score >=70 && score <90) {
			grade='B';
		}else if (score >=50 && score <70) {
			grade='C';
		}else {
			grade='F';
		}

		System.out.println("Your grade is " +grade);
	
		//If your grade is A or B -> Your are a good student
		//otherwise ---------------> You should study more
		
		if (grade=='A' || grade=='B') {
			System.out.println("Your are a good student");
		}else {
			
		}
		
	}

}
