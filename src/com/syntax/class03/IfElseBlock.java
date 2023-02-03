package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		
		int num1=100;
		int num2=500;
		
		//Which number is largest
		
		if(num1>num2) {
			System.out.println(num1 +" is larger than " +num2);
		}else {
			System.out.println(num2 +" is larger than " +num1);
		}

		int temp=45;
		
		// if temp is more than 45 -> Im going for a walk
		// otherwise -> I am staying at home
		
		if(temp>=45) {
			System.out.println("I am going for a walk");
		}else {
			System.out.println("I am staying at home");
		}
		
		/* I need a variable that stores a gender
		 * if gender is f -> please use front of train
		 * Otherwise      -> please use back of train
		 */
		
		char gender='m';
		
		if(gender=='f') {
			System.out.println("please use front of train");
		}else {
			System.out.println("please use back of train");
		}
		
		
	}

}
