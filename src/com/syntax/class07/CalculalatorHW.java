package com.syntax.class07;

import java.util.Scanner;

public class CalculalatorHW {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator.
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 * Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */

	
		int num1;
		int num2;
		char operator;
		Scanner scan;
        scan = new Scanner(System.in);
	
	System.out.println("Please enter first number");
	num1 = scan.nextInt();
	
	System.out.println("Please enter second number");
	num2 = scan.nextInt();
	
	System.out.println("What is the operator");
	operator= scan.next().charAt(0);
	
	int result=0;
	
	switch(operator) {
	case'+':
		result=num1+num2;
		break;
	case'-':
		result=num1-num2;
		break;
	case'*':
		result=num1*num2;
		break;
	case'/':
		if(num2!=0) {
		result=num1/num2;
		}else {
			System.out.println(" We cannot divide a number by " +num2);
		}
		
		break;	
	default:
		System.out.println("INVALID OPERATOR");
	}
	
	System.out.println(result);
	
	
	System.out.println("--------------- ANOTHER WAY -------------------");
	
	
	
	
	
	}
}
