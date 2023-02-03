package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=1;
		
		if(vaccine) {
			System.out.println("How many doses do you have?");
			if(dose==1) {
				System.out.println("You need another shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
	
		System.out.println("----------------------------------------------------------");
		
		/*Declare a variable for allergy
		 * If you have allergy -> If you have pollen
		 * ---------------------> If you have peanut
		 * ---------------------> If you have gluten
		 * If no allergy -------> You are lucky
		 */
		
		boolean allergy=true;
		
		//OUTER IF
		if(allergy) { 
			System.out.println("Lets check what allergies you have");
			String allergyType="gluten";
			
			//NESTED IF -> ALWAYS HAS A DEPENDENCY ON OUTER IF.
			//OUTER IF  -> MUST BE TRUE IN ORDER FOR NESTED IF TO BE CHECKED.
			if(allergyType.equals("pollen")) {
				System.out.println("Please stay home when trees are blooming. Take med A");
				
			}else if (allergyType.equals("peanut")) {
				System.out.println("Please do not eat food that contains nuts. Take med B");
				
			}else if (allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet. Take med C");
			
			}else {
				System.out.println("I dont know which suggestion to give you");
			}
			
		}else {
			System.out.println("You are lucky");
		}
		
		
		
		
		
		
	}

}
