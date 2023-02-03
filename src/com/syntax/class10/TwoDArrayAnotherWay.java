package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 10, 20, 30, 40 }, //0
				
				{ 100, 200, 300, 400 }, //1
				
				{ 1000, 2000, 3000, 4000 } //2
		};

		System.out.println(numbers[2][1]);//2000
		
		System.out.println("----------- TASK 1 -------------");
		
		String [][] names = {
				
				{"Mr","Mrs","Ms","Miss"},
				{"Smith", "Jordan","Jackson","Obama"}
				
		};
		
		System.out.println(names[0][1]+" "+names[1][0]); //Mrs Smith
		System.out.println(names[0][0]+" "+names[1][3]); //Mr obama
		System.out.println(names[0][2]+" "+names[1][2]); //Ms Jackson
		System.out.println(names[0][3]+" "+names[1][1]); //Miss Jordan
	
		System.out.println("----------- LONGER WAY -------------");
		
		names[0][0]="Mr";
		names[0][1]="Mrs";
		names[0][2]="Ms";
		names[0][3]="Miss";
		
		names[1][0]="Smith";
		names[1][1]="Jordan";
		names[1][2]="Jackson";
		names[1][3]="Obama";
		
		System.out.println(names[0][1]+" "+names[1][0]); //Mrs Smith
		System.out.println(names[0][0]+" "+names[1][3]); //Mr obama
		System.out.println(names[0][2]+" "+names[1][2]); //Ms Jackson
		System.out.println(names[0][3]+" "+names[1][1]); //Miss Jordan
		
		
		
	}
}
