package com.syntax.class14;

public class Task3 {

	// Create a method that will say "Hello" in different language
	// based on the country that will pass when method is executed

	// 1) Method DataType = String
	// 2) Method Name = sayHello
	// 3) Parameter = String data type (String country)
	String sayHello(String country) {
		
		// 4) Method Body = switch logic
		// 5) Method type = return keyword
		switch (country) {
		case "USA":
			return "Hello";
		case "France":
			return "Bonjour";
		case "Turkey":
			return "Merhaba";
		default:
			return "Unknown";
		}
	}

	public static void main(String[] args) {

		// 6) Create/Name object
		Task3 object = new Task3();
		
		// 7) Argument 
		String country = object.sayHello("Turkey");
		
		// 8) Call Method
		System.out.println(country);
		
		
	}

}
