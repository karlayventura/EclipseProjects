package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		
		String [][] food = {
				
				{"red bull", "burger", "steak", "fries"},
				{"curry", "biriyani", "butter chicken"},
				{"noodles", "pad thai", "tom yum"},
				{"pizza", "pasta"}
				
		};
		
		System.out.println("---------- ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP ----------");
		
		//Outer loops over each array inside 2D Array
		for(String[]cousine :food) {
			
			//Inner loops over each element from selected array
			for(String f:cousine) {
				System.out.println(f +" ");
			}
			System.out.println();
		}
		
		System.out.println("-------- USING FOR NESTED LOOP -------");
		
		
		//Iterates over every array/row
		for(int row = 0; row < food.length; row++) {
			
			//Iterates over every column of specified row
			for(int col = 0; col < food[row].length; col++) {
				
				//Accessing elements
				System.out.println(food[row][col]+" ");
			}
			System.out.println();
		}
		

		
		
		
	}
}
