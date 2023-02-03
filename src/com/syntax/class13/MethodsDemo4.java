package com.syntax.class13;

public class MethodsDemo4 {
	
	// 1) Create a method that takes a boolean isSaleOn double price double discount
	// 2) If isSaleOn = true return discounted price
	// 3) Otherwise return original price
	
	// Start with double because return value is a double data type
	double checkDiscount (boolean isSaleOn, double originalPrice, double discount) {
		
		if (isSaleOn) {
			return originalPrice-originalPrice*discount;
		}else {
			return originalPrice;
		}
	}
	
	

	public static void main(String[] args) {
		
		
		MethodsDemo4 obj = new MethodsDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));

	
	}
}
