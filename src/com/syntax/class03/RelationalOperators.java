package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2); //false
		System.out.println(num1==num2); //false
		System.out.println(num1<num2); //true
		
		boolean result = num1==num2; //false
		
		System.out.println("Result is " +result);
		
		System.out.println(num1=num2); //Reassigning
		System.out.println(num1);
		
		System.out.println(num1==num2); //true - comparing
		System.out.println(num1!=num2); //false

	}

}
