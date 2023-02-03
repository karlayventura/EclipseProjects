package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		
		// .trim = Removes only the spaces before or after name
		String name = "     Karla      ";
		System.out.println(name);
		System.out.println(name.trim());
	
		// .startsWith = Checks if string starts with a specific word.
		String name2 = "Run Moreed"; // A person who always fears his wife & is always obedient or submissive to his wife
		System.out.println(name2.toLowerCase().startsWith("Run")); //Method chaining
		System.out.println(name2.startsWith("Moreed"));

		// .endsWith = Checks if string ends with a specific word.
		System.out.println(name2.endsWith("Moreed"));
		System.out.println(name2.endsWith("d")); // Checks for 1 character
		
		// .contains = Checks with string contains a specific character
		System.out.println(name2.contains("M"));
	}

}
