package Palindrom;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a = scan.nextLine();
		
		if (isPalindrome(a)) {
			System.out.println(a + " is palindrome");
		} else {
			System.out.println(a + " is not a palindrome");
		}
		scan.close();

	}
	
	static boolean isPalindrome(String a) {
		if (a.length() == 0 || a.length() == 1) {
			return true;
		}
		
		if (a.charAt(0) == a.charAt(a.length() - 1)) {
			return isPalindrome(a.substring(1, a.length() - 1));
		}
		return false;
	}

}
