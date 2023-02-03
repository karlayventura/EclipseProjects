package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char choice='l';
		String answer;
		
		switch (choice) {
		
		case 'y':
			answer="Yes";
			break;
		case 'n':
			answer="No";
			break;
		case 'm':
			answer="Maybe";
			break;
		default:
			answer="UNKNOWN";
			break;
		}
		
		System.out.println(answer);
		
		System.out.println("----------------------------------------");
		
		/*
		 * Declare a variable to store a car
		 * Based on the value of care define the country of origin
		 */
		
		String car="lada";
		String country;
		
		switch(car.toLowerCase()) {
		
		case "bmw":
			country="Germany";
			break;
		case "ford":
			country="USA";
			break;
		case "lada":
			country="Russia";
			break;
		case "toyota":
			country="Japan";
			break;
		default:
			country="UNKNOWN";
		}
		
		System.out.println(car +" is from " +country +" country");
		
		
		
	}

}
