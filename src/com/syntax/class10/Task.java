package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		// Create an array and retrieve all elements in reverse order
		
		int [] arr = {10,20,30,40,50,60};	
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("---------- REVERSE ORDER -------------");
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] +" ");
		}
		
		// CANNOT USE FOR EACH LOOP FOR REVERSE


	}
}
