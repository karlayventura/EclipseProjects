package com.syntax.class14;

public class Task4 {

	// Create a method = createEmail().
	// Based on values of users name, last name and email type
	// Your method should return complete email address.
	// Example : createEmail(John, snow, gmail) = johnsnow@gmail.com
	
	// 1) Method DataType = String
	// 2) Method Name = createEmail
	// 3) Parameter = (String userName, String lastName, String emailType)
	String createEmail(String userName, String lastName, String emailType) {
		
		// 4) Method body = return keyword logic
		return userName+lastName+"@"+emailType+".com";
	}
	
	
	
	public static void main(String[] args) {
		
		Task4 obj = new Task4();
		System.out.println(obj.createEmail("Karla", "ventura", "gmail"));
	
		


	}

}
