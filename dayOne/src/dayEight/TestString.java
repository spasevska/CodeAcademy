package dayEight;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
//		String s1 = "123456789";
//		for (int i = 0; i < s1.length(); i++) {
//			System.out.print(s1.charAt(i) + ", ");
//			
//		}
//		System.out.println();
//		
//		
//		int j = 0;
//		while (j < s1.length()) {
//			System.out.print(s1.charAt(j) + ", ");
//			j++;
//		}
//		System.out.println();
//		
//		
//		int k = 0;
//		do {
//			System.out.print(s1.charAt(k) + ", ");
//			k++;
//		} while (k < s1.length());
		
		
	
//		ova e standardna greska koja se pravi, site promenlivi treba da bidat deklarirani nadvor ne vnatre vo while
//		while (true) {
//			int k = 0;
//			if (k < s1.length()) {
//				System.out.print(s1.charAt(k) + ", ");
//			}
//			k++;
//		}
		
		String d = "Dijana";
		System.out.println(d.toUpperCase());
		
		//1. using our own logic
		//for this we will require 2 string objects
		String original; //for storing user input
		String rev = ""; //for storing reverse of string
		
		//now lets take input from user
		System.out.println("Enter String to reverse: ");
		Scanner sc = new Scanner(System.in);
//		original = sc.nextLine();
		original = sc.next();
		
		//now 2nd way
		//2. using standard JAVA API
		//for this we will need object of StringBuffer
		
		StringBuffer sb = new StringBuffer(original);
		rev = sb.reverse().toString();
		System.out.println("Original string is: " + original);
		System.out.println("Reverse of string is: " + rev);
		System.out.println("Reverse of string is: " + rev.toUpperCase());
	}
		
		
//		int len = original.length();
//		
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + original.charAt(i);
//			
//			
//			// lets print both string objects
//			System.out.println("Original string is: " + original);
//			System.out.println("Reverse of string is: " + rev);
//		}

	}
	
//	Homerork 1 - print string in revers
//	Homework 2 - print string in reverse and uppercase

