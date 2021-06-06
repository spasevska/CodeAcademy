package NameFirst;

import java.util.Scanner;

public class TestName {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Write your name: ");
		String name = scan.next().toLowerCase();
		theName(name);		
	}


	public static void theName(String name) {
		if (name.startsWith("A") || name.startsWith("E") || name.startsWith("O") || name.startsWith("I") || name.startsWith("U")) {
			System.out.println("The first letter of your name is a vowel.");
		} else {
			System.out.println("The first letter of your name is a constant.");
		}
	}
	

}
