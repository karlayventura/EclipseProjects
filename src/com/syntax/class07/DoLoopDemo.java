package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("-------- WHILE CHECKS CONDITION BEFORE EXECUTION ---------");
		
		int num = 1;
		
		while(num <= 3) { // MORE USED THAN DO WHILE
			System.out.println("Hello"); // 5 times
			num++;
		}
		
		System.out.println("-------- DO WHILE CHECKS CONDITION AFTER EXECUTION ---------");
		
		int num1 = 1;
		
		do { // LESS USED THAN WHILE
			System.out.println("Hello");
			num1++;
		}while(num1 <= 3);
		
		System.out.println(" I want to print numbers from 1 to 30 using do while loop ");
		
		int num2= 1;
		
		do {
			System.out.print(num2 +" ");
			num2++;
		}while(num2 <= 30);
		
		

	}
}
