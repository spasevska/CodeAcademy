package NameFirst;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Write the temperature in Celsuis: ");
		float C = scan.nextFloat();
		
		float F = C * (9/5) + 32;
		System.out.println(C + " Celsius is " + F + " Fahrenheit");
	}
}

