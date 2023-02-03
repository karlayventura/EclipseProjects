package com.syntax.class12;

public class Dog {
	
	// Attributes, fields, properties
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	// Behaviors, function, methods
	void bark() {
		System.out.println("Dog is barking ...");
	}
	void eat(){
		System.out.println("Dog is eating");
	}	
	void sleep() {
		System.out.println("Dog is sleeping");
	}	
	
	public static void main(String[] args) {
		// Creating an object scooby from class dog
		  Dog scooby = new Dog();
		// Dog is a CLASS
	    // Scooby is an OBJECT.
		// = is an assignment operator
		// new = is the KEYWORD that we use to create the OBJECTS of a CLASS.
		// Dog() we are calling the CONSTRUCTOR of the CLASS
		// Scanner scan = new Scanner(System.in); <- Similar to scanner class.
		  scooby.bark();
		  scooby.eat();
		  scooby.sleep();
		
		
	}
}
