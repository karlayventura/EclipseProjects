package com.syntax.class14;

public class Task1 {

	// Create a method that will take 2 parameters as numbers & print which number is largest
	
	// 1) Method type = void
	// 2) Method name = "printLarger"
	// 3) Parameter DataType = 2 parameter numbers (int num1, int num2)
	void printLarger (int num1, int num2) {
		
		// 4) Method body = if logic to find largest
		if (num1>num2) {
			System.out.println("Number 1 is greater");
		}else if (num1<num2) {
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("Numbers are the same");
		}
	}
	
	public static void main(String[] args) {
		
		// 5) Create/Name a object
		Task1 largestNumber = new Task1();
		// 6) Calling method
		largestNumber.printLarger(10, 12);
		largestNumber.printLarger(12, 10);
		largestNumber.printLarger(10, 10);
		
		
		

	}

}
