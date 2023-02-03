package com.syntax.class12;

public class Horse { // <- Horse Is a class.
	
	// ATTRIBUTES/FIELDS/PROPERTIES = 
	String name;
	String breed;
	int age;
	double weight;
	
	// BEHAVIORS/METHODS/FUNCTIONS = define/defining the behavior.
	void run() {
		System.out.println(name +" is running");
	}
	void eat() {
		System.out.println(name +" is eating");
	}
	void printCompleteInfo() {
		System.out.println("name = "+name);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);
	}

	public static void main(String[] args) {
		
		// lilysHorse = is the object. (new keyword -> is used when creating an object.)
		Horse lilysHorse = new  Horse(); 
		// Accessing the property ".name=" on the object "lilysHorse." and setting its value to "spirit";
		lilysHorse.name="spirit"; 
		lilysHorse.breed="stallion";
		lilysHorse.age=20;
		lilysHorse.weight=400;
		// Calling its behaviors
		lilysHorse.run();  
		lilysHorse.printCompleteInfo(); 

		System.out.println("*****************************");
		
		Horse mrAsHorse = new Horse(); // mrAsHorse
		mrAsHorse.name="Tuzik";
		mrAsHorse.breed="Mustang";
		mrAsHorse.age=15;
		mrAsHorse.weight=450;
		mrAsHorse.run();
		mrAsHorse.printCompleteInfo();
	
	
	
	}
}
