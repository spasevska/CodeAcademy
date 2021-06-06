package NameFirst;

import java.util.Scanner;

public class First {
		public static void main(String[] args) {
			System.out.println("Factorial of 5 is: " + factorial(5));
		}
		
		static int factorial (int n) {
			if (n <= 1) {
				return n;
			} else {
				return factorial(n-1) + factorial(n-2);
			}
		}

// =====================================
	
//	public static int fib (int n) {
//
//		if (n <= 1)
//			return n;
//		else
//			return fib(n-1) + fib(n-2);
//	}
//
//	public static void main(String[] args) {
//		int n = 9;
//		if(n < 0)
//			System.out.println("fibonnacci number is not defined	");
//		else
//			System.out.println(fib(n));
//
//	}

}
