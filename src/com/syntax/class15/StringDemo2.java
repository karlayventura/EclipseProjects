package com.syntax.class15;

public class StringDemo2 {

	public static void main(String[] args) {
		
		// .charAt Method :
		
		String name = "How are you guys @";
		//System.out.println(name.charAt(3));
		
		//Write a loop to print all the characters of a string
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i)+"_");
		}
		
		
		

	}
}
