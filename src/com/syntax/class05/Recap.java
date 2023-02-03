package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//String value -> String name="Karla";
	    System.out.println("Please enter your name");
		String name=input.next();
		
		//Int value -> int age=25;
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		System.out.println("Your name is " +name +"and your age is " +age);

		//Boolean value -> boolean b=true;
		System.out.println("Please enter boolean value");
		boolean booleanValue=input.nextBoolean();
		System.out.println(booleanValue);
		
		//Double value -> double d=10.00;
		System.out.println("Please enter decimal value");
		double d=input.nextDouble();
		System.out.println(d);
		
		//Char value -> char c='L';
		System.out.println("Please enter char value");
		char character=input.next().charAt(0);
		System.out.println(character);
		
		
		
	}

}
