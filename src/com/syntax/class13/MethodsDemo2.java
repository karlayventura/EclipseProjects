package com.syntax.class13;

public class MethodsDemo2 {
	
	// 1) Create a method that takes an animal name and person name.
	// 2) If name is equal to "Teyfur" and animal is "Horse"
	// 3) Print camel otherwise print horse.
	
	void TeyfurAndHorse(String name, String animal) {
		if("Teyfur".equals(name) && "Horse".equals(animal)) {
			System.out.println("This is a camel");
		}else {
			System.out.println("This is a horse");
		}
	}

	public static void main(String[] args) {
		
		MethodsDemo2 obj = new MethodsDemo2();
		obj.TeyfurAndHorse("Teyfur", "Horse");
		obj.TeyfurAndHorse("Tarik", "Horse");

	
	
	}
}
