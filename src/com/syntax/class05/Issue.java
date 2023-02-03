package com.syntax.class05;

import java.util.Scanner;

public class Issue {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Using next");
		
		String value=scan.next();	//nextInt(); nextDouble(); nextBoolean(); next().chartAt(0);	
		System.out.println(value);
		
		scan.nextLine();//will resolve skipping
		
		
		System.out.println("Using nextLine");
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of program");

	}

}
