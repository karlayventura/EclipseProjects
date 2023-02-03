package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
		
		// I want to create an array of colors;
		String[] colors = {"blue", "pink", "yellow", "orange"};
		System.out.println("My favorite color is "+colors[2]);

		//Possible to do declaration and initialization in 2 steps
		String[] array; // 1.Declaring
		array=new String[4]; // 2.Initializing Size
		
		/* NOT possible to do declaration and initialization in 2 steps
		 * 
		 * String[] arr;
		 * arr = {};
		 */
		
		System.out.println("-------- TASK --------");
		
		
 		
 		/* Create an array of names and store all names of your group.
 		 * Then print out your name from that array.
 		 * Use 2 different ways of creating an array.
 		 */
 		
 		String [] names = {"Cake", "Candy", "Cookies"};
 		System.out.println(names[1]);
 		
 		String [] name = new String [3];
 		name[0]="Cake";
 		name[1]="Candy";
 		name[2]="Cookie";
 		System.out.println(name[1]);
 		
 	
 		/*Create an array of words: Java, Saturday, day, Coding, is.
 		 * Print the following sentence using elements of array
 		 * "Saturday is java coding day.
 		 */
		
		String [] words = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
	}
}
