package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		
		Phone pixel = new Phone ();
		pixel.make="pixel";
		pixel.model="pixel 6";
		pixel.noOfCams=2;
		pixel.color="blue";
		pixel.screenSize=6.8;
		pixel.os="Android 12";
		pixel.phoneNumber="202-000-0000";
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();

	
	
	}
}
