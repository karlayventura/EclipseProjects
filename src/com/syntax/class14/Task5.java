package com.syntax.class14;

public class Task5 {
	
	// Write a method to return whether given number is prime or not?
	
	boolean isPrime(int number) {
		boolean isPrime = true;
		
		if(number>1) {
			for (int i=2; i<number; i++) {
				if (number%i==0) {
					isPrime=false;
				}
			}
		}else {
			isPrime=false;
		}
	return isPrime;
	}
	

	public static void main(String[] args) {
		
		Task5 object = new Task5();
		System.out.println(object.isPrime(5));
		
		

	}

}
