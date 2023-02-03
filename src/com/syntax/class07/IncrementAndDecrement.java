package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int num=10;
		
		num=num+1;// 10+1=11
		
		num+=1; // ShortHand Operators
		
		num++; // Increment operators
		
		System.out.println(num);//13
		
		// Increment operator adds 1 to a VARIABLE ONLY
		
		num++;
		System.out.println(num);
		
		// 10++; CE: Invalid argument to operation ++/--
		
		// Decrement Operator subtracts 1 from a variable
		
		num--;
		num--;
		num--;
		System.out.println(num);

	}

}
