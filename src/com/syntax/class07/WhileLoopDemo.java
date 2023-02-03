package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("The value of i outside of while loop = " + i);

		// I need to print values from 2 to 20

		int a = 2;

		while (a <= 20) {
			System.out.println(a);
			a++;
		}

		// I need to print values from 1 to 50 all in 1 line

		int b = 1;

		while (b <= 50) {
			System.out.print(b + " "); // contenation operator +" "
			b++;
		}

		System.out.println("--- I NEED NUMBERS FROM 20 TO 1 ---");

		int c = 20;

		while (c >= 1) {
			System.out.print(c + " ");
			c--;
		}

		// TASK
		System.out.println("--- PRINT ONLY EVEN NUMBERS FROM 1 TO 30 ---");

		int d = 2;

		while (d <= 30) {
			System.out.print(d + " ");
			d += 2; // <-- SHORTHAND ASSIGNMENT same as : d=d+2
		}

		System.out.println("--- ANOTHER WAY WITH IF STATEMENT ---");

		int e = 1;

		while (e <= 30) {

			if (e % 2 == 0) {
				System.out.print(e + " ");
			}
			e++;
		}

		System.out.println("-------- TASK ----------");

		// PRINT NUMBERS FROM 1 TO 100 (IN 1 LINE WITH SPACE)
		
		int num = 1;
		
		while(num <= 100) {
			System.out.print(num +" ");
			num++;
		}
		
		// PRINT NUMBERS FROM 100 TO 1 (IN 1 LINE WITH SPACE)
		
		int num1 = 100;
		
		while(num1 >= 1) {
			System.out.print(num1 +" ");
			num1--;
		}
		
		// PRINT EVEN NUMBERS FROM 20 TO 100 (IN 1 LINE WITH SPACE)
		
		int num2 = 20;
		
		while(num2 >= 100) {
			System.out.println(num2 +" ");
			num2+=2;
		}


		System.out.println("End of the code");

	}
}
