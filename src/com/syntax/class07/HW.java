package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no.
		 * if there is no sale --> you are not going for shopping.
		 * if there is yes sale --> ask you user for the price of the item.
		 * 
		 * Based on the price you have to calculate the price of the item after the discount.
		 * 
		 * if price is less than $20 --> apply 10% discount
		 * if price is between $20 & $100 --> 20% discount
		 * if price between $100 & $500 --> 30% discount
		 * otherwise apply 50% discount.
		 * 
		 * Output of the program should be:
		 * After discount ___ the price of the item reduce from __ to ___
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for sale");
		String sale = scan.next();
		
		if(sale.equalsIgnoreCase("no")) {
			System.out.println("You are not going for shopping.");
		}else if(sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of the item?");
			
			int price = scan.nextInt();
			int discount = 0;
			
		if(price<20) {
			discount = 10;
		}else if(price >= 20 && price <=100) {
			discount = 20;
		}else if(price >= 100 && price <=500) {
			discount = 30;
		}else {
			discount = 50;
		}
		
		int saving = (price * discount)/100;
		int finalPrice = price - saving;
		
		System.out.println("After " +discount +"% discount the price of the item reduce from " +price + " to " +finalPrice);
			
			
		}	
	
	
	
	
	
	
	
	
	}
}
