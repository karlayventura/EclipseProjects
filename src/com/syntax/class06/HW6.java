package com.syntax.class06;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
	
		/*
		 * Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		 * if -> the average score >=90 ---------> GRADE=A
		 * if -> the average score >=70 and <90 -> GRADE=B
		 * if -> the average score >=50 and <70 -> GRADE=F
		 * 
		*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		int quizScore = scan.nextInt();
		
		System.out.println("Please enter your mid-term score");
		int midtermScore = scan.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore = scan.nextInt();
		
		int score = (quizScore + midtermScore + finalScore) /3;
		
		if(score >= 90) {
			System.out.println("Grade A");
			System.out.println("Your are a good student");
		}else if (score >=70 && score <90) {
			System.out.println("Grade B");
			System.out.println("Your are a good student");
		}else if (score >=50 && score <70) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}
		
		
		
		
	}

}
