package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/* Create an array of countries.
		 * While retrieving all values from an array 
		 * Print capital for each country.
		 */
		
		String [] countries = {"Germany", "Ukraine", "Russia", "UK", "Poland"};
		String capital = null;
		
		System.out.println("-------------- SWITCH WAY -----------------");
		
		for(int i = 0; i < countries.length; i++) {
			
			switch(countries[i]) {  // Using Switch 
			
			case "Poland":
				capital="Warsaw";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "Ukraine":
				capital="Kiev";
			    break;
			case "Russia":
				capital="Moscow";
				break;
			case "UK":
				capital="London";
				break;
			}
			System.out.println("The capital of the country " +countries[i] +" is " +capital);	
		}
			System.out.println("-------------- IF ELSE IF WAY -----------------");
			
			for(String country:countries) {
				
				if(country.equals("Poland")) { // Using if else if.
					capital="Warsaw";
				}else if (country.equals("Germany")) {
					capital="Berlin";
				}else if (country.equals("Ukraine")) {
					capital="Kiev";
				}else if (country.equals("Russia")) {
					capital="Moscow";
				}else if (country.equals("UK")) {
					capital="London";
				}
				System.out.println("The capital of the country " +country +" is " +capital);	
			}
			
		
		

	
	
	
	}
}
