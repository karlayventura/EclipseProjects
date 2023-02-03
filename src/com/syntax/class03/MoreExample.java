package com.syntax.class03;

public class MoreExample {

	public static void main(String[] args) {
		
		/*
		 * we need to declare a boolean variable hungry yes or no
		 * 
		 * If we are hungry --> i am going to eat
		 * otherwise --> I am going to drink a tea
		 */

		boolean hungry=false;
		
		if(hungry) {
			System.out.println("I am going to eat");
		}else {
			System.out.println("i am going to drink a tea");
		}
		
		boolean traffic=true;
		
		if(traffic) {
			System.out.println("I am coming home late");
		}else {
			System.out.println("No traffic, I am on time");
		}
				
		/*Define a variable to store a browser
		 * 
		 * If browser is chrome -> We are executing tests on chrome
		 * Otherwise ------------> I am not executing any test cases
		 */
		
		String browser="chrome";
		
		//Always use equals to compare 2 strings
		if(browser.equals("chrome")) {
			System.out.println("We are executing tests on chrome");
		}else {
			System.out.println("I am not executing any test cases");
		}
		
		//would work in this example but not preferable
		if (browser=="chrome") { 
			System.out.println("we are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
			}
		
		/*
		 * if (browser) { }//ERROR: Type mismatch: cannot convert from String to boolean
		 */
		
	}

}
