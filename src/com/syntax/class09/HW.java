package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		
		System.out.println("--------- CLOCK ---------");
		
		for (int h = 0; h <= 12; h++) {
			for (int m = 0; m <= 59; m++) {
				System.out.println(h +":" +m);
			}
		}
	
		System.out.println("------- ANOTHER WAY ---------");
		
		String time;
		
		for (int h = 0; h < 24; h++) {
			
			for (int m = 0; m <= 59; m++) {
				
				if (h<10 && m<10) {
					time = "0" +h +":"+"0"+m;
				}else if(h<10 && m>=10) {
					time = "0" +h +":" +m;
				}else if(h>=10 && m<10) {
					time = h+ ":" +"0"+m;
				}else {
					time = h +":" +m;
				}
				
				
				
			}
		}
	
	
	
	}
}
