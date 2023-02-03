package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		// .equals and .equalsIgnoreCase Method :
		
		String userName = "LILY";
		String password = "Lily123";
		
		if("Lily".equals(userName) && "Lily123".equals(password)) {
			System.out.println("Welcome Back");
		}else {
			System.out.println("Username or password is incorrect");
		}

		System.out.println("-------- Ignore Case ---------");
		
		if("Lily".equalsIgnoreCase(userName) && "Lily123".equals(password)) {
			System.out.println("Welcome Back");
		}else {
			System.out.println("Username or password is incorrect");
		}
	
		
	
	
	
	}
}
