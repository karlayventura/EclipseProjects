package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("A");
			System.out.println("B");
		}

		System.out.println("---------------------------------------");
	
		for (int i = 1; i <= 3; i++) { // Outer loops controls number of complete iteration of inner loop
			
			for (int j = 1; j <= 3; j++) { // Inner loops always depends on outer loop
				System.out.println("Hello");
			}
			
			System.out.println("Good Morning");
			break; // placed on outer loop will break entire loop after nested executes 3x and execute outer 1x
		}
	
		System.out.println("---------------------------------------");
		
		for (int i = 1; i <= 3; i++) { // Outer loops controls number of complete iteration of inner loop
			
			for (int j = 1; j <= 3; j++) { // Inner loops always depends on outer loop
				System.out.println("Hello");
				break; //placed in inner loop will break only nested loop after 1 execution and executes outer
			}
			
			System.out.println("Good Morning");
		}
		
		System.out.println("---------------------------------------");
		
		for (int i = 0; i <=2; i++) { //0,1,2
			
			for (int j = 1; j <= 2; j++) { //1,1,
				
				if (j == 2) {
					continue;
				}
				System.out.println("Good Morning"); //1 each x3
				
			}
			System.out.println("Hello"); // 3
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
