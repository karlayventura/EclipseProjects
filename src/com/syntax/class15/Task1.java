package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {

		// .isEmpty() Method :
		
		String userName = "Asel";
		String password = "pass1234Asel";
		String confrimedPassword = "pass1234Asel";

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else {

			if (password.length() < 8) {
				System.out.println("Password is too short");
			} else {

				if (password.contains(userName)) {
					System.out.println("Password cannot contain username");
				} else {

					if (password.equals(confrimedPassword)) {
						System.out.println("Your username and password has been created");
					} else {
						System.out.println("Password does not match");
					}
				}
			}
		}

	}
}
