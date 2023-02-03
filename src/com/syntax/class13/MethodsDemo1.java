package com.syntax.class13;

public class MethodsDemo1 {
	
	// 1) void is a type of method = (doesn't return anything when called.)
	// 2) Name of the method = checkEvenOdd.
	// 3) () = is used to pass information from outside.
	//    (int number) = parameters that we can pass to this method when called.
	//    We can use this variable inside the logic of method.
	
	void checkEvenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
	   }
	}

	void checkWeather (boolean isRaining) {
		if(isRaining) {
			System.out.println("I'm staying home");
		}else {
			System.out.println("Lets go for a walk");
		}
	}
	
	// Create a method to check a name if name if "Teyfur" it prints "Memes"
	// Otherwise if name is "Maha" print "doctor"
	// else prints "I dont know you"
	
	void checkName (String name) {
		if ("Teyfur".equals(name)) {
			System.out.println("Memer");
		}else if ("Maha".equals(name)){
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown");
		}
	}
	
	public static void main(String[] args) {
	
		MethodsDemo1 object1 = new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		
		object1.checkWeather(false);
		
		object1.checkName("Teyfur");
	
	
	}
}
