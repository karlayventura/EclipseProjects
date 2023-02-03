package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		//Logical not is used to revert condition
		
		boolean value=!false;
		System.out.println(value);
		
		System.out.println("---------------------------------------------");
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time to work");
		}
		System.out.println("---------------------------------------------");
		
		String day="Saturday";
		
		if(!day.equals("Saturday")) {
			System.out.println("Today is not saturday");
		}
		
		boolean checkboxChecked=false;
		
		if(!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}
		
		System.out.println("---------------------------------------------");
		
		String java="hard";
		
		if(!java.equals("easy")) {
			System.out.println("You are genious");
		}
		
		
		System.out.println("---------------THE END ----------------------");
		
	}

}
