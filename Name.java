package NameFirst;

import java.util.Scanner;

public class Name {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write your name: ");
		String name = scan.nextLine().toLowerCase();
		nameBrojac(name);
	}
	
	public static void nameBrojac(String name) {
		int samoglaskiBrojac = 0, soglaskiBrojac = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
				samoglaskiBrojac++;
			} else {
				soglaskiBrojac++;
			}
			
		}
		System.out.println("Vasheto ime sodrzi " + samoglaskiBrojac + " samoglaski " + soglaskiBrojac + " soglaski");
	}

}

