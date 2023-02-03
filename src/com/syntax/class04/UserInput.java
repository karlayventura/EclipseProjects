package com.syntax.class04;

import java.util.Scanner; //We need to import Scanner into our class

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); //Creating a Scanner
		
		System.out.println("Please enter your name");
		
		//If you want to capture single String -> use next();

		String name=input.next(); //type string and hit enter
		System.out.println("Your name is "+name);
		
		//if you want to capture int -> use nextInt();
		
		System.out.println(name+ " Please enter your age");
		
		int age=input.nextInt(); //type integer and hit enter
		
		System.out.println("Your name is " +name +" and your age is " +age);
		
	}
}
