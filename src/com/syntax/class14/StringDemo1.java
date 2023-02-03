package com.syntax.class14;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		// Create String object = String literal
		String name = "karla";// Shorter way = always use this method
		// Create String object = new keyword
		String name2= new String("Karla"); // Longer way = never use this method
		
		System.out.println(name);
		System.out.println(name2);
		
		// .length = Characters size in string
		System.out.println(name.length());
		System.out.println(name2.length());
		
		// .toLowerCase = Converts Upper case to Lower case in string
		System.out.println(name2.toLowerCase());
		String newName=name2.toLowerCase();

		// .toUpperCase = Converts Lower case to Upper case in string
		System.out.println(name2.toUpperCase());
		
		// StringVal + StringVal or .cancat(); = Concatenation adding to string values
		System.out.println(name+name2); // Always use this method
		System.out.println(name.concat(name2));
		
		// .isEmpty = Checks if string is empty true , if not empty false
		System.out.println(name.isEmpty());
		
	
	
	}
}
