package com.syntax.class10;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		int[][] numbers = {

				{ 10, 20, 30 }, //0 index = 1 row
				
				{ 100, 200, 300, 400 }, //1 index = 2 row
				
				{ 1000, 2000 } //2 index = 3 row
		};

	
	//Retrieving all elements from 2D array
	
	for(int i = 0; i < numbers.length; i++) { // single 1D arrays of each row
		
		for(int j = 0; j < numbers[0].length; j++) { // Elements/Values of each column based on row.
			
		}
	System.out.println();
	}
	
	// How to find out size of 2D array?
	
		//How to find out how many single 1D arrays (rows) are in 2D array?
		int size = numbers.length; 
		System.out.println(size); // 3 Single arrays (Rows) in 2D array.
			
		//How to find out how many elements/values (Column) in Each array?
		int sizeOf1Array = numbers[0].length;
		System.out.println("Size of 1st array = "+sizeOf1Array); // 3 Elements/Values (Columns) in 1st array
		
		int sizeOf2Array = numbers[1].length;
		System.out.println("Size of 2nd array = "+sizeOf2Array); // 4 Elements/Values (Columns) in 2nd array
		
		int sizeOf3Array = numbers[2].length;
		System.out.println("Size of 3rd array = "+sizeOf2Array); // 2 Elements/Values (Columns) in 3rd array

	}
}
