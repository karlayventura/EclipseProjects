package com.syntax.class07;

import java.util.Scanner;

public class CalculatorUsingIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1= scan.nextInt();
		
		System.out.println("Please enter operation : +,-,*,/");
		int operator = scan.next().charAt(0);
		
		System.out.println("Please enter second number");
		int num2= scan.nextInt();
		
		int result = 0;
		
		if(operator == '+'){
			result = num1+num2;
		}else if(operator == '-'){
			result = num1-num2;
		}else if(operator == '*'){
			result = num1*num2;
		}else if(operator == '/'){
			result = num1/num2;
		}else {
			System.out.println("INVALID ENTRY");
		}
		
	System.out.println(result);
	
	
	
	}
}
