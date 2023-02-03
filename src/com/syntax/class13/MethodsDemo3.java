package com.syntax.class13;

public class MethodsDemo3 {
	
	// 1) int = we specify the datatype that method will return
	// 2) squareNumber = name of method
	// 3) (int number) = parameters of the method
	// 4) return = tells java what to return from this method,
	int squareNumber (int number) {
		return number*number;
	}
	
	int returnSameNumber (int number) {
		
		return number;
	}
	
	// 1) Create a method that takes a person name & animal name
	// 2) If the person name is "Teyfur" & and if animal is "Horse" it returns "camel"
	
	String personAndAnimalName (String personName, String animalName) {
		
		if("Teyfur".equalsIgnoreCase(personName)&& "Horse".equalsIgnoreCase(animalName)) {
			return "camel";
		}else if("Horse".equalsIgnoreCase(animalName)) {
			return "Horse";
		}else {
			return "Unknown";
		}
	}

	public static void main(String[] args) {
		
		// Object creation
		MethodsDemo3 obj = new MethodsDemo3();
		// Calling method and storing inside a variable
		int result = obj.squareNumber(5);
		System.out.println(result);
		
		System.out.println(obj.personAndAnimalName("Teyfur", "Horse"));
		System.out.println(obj.personAndAnimalName("Tameer", "Horse"));
		System.out.println(obj.personAndAnimalName("Teyfur", "Monkey"));
		
	}
}
