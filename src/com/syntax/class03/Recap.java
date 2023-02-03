package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {

		String dayTime = "morning";
		int date = 22;
		String month = "January";

		// Today is morning of January 22.
		// + is used to attach string to anything

		String sentence = "Today is " + dayTime + " of " + month + " " + date;

		System.out.println(sentence);
		
		System.out.println(2022);
		System.out.println("2022");
		
		int year=2022;
		String year1="2022";
		
		System.out.println(year+10); //2032
		System.out.println(year1+10);//202210

	}

}
