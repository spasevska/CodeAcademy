package Sabota1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sabota1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write the number: ");
		int fa = scan.nextInt();
			
		List<Integer> Fibo = new ArrayList<>();

		int i = 0, j = 1;	
		int sum = 0;
				
		Fibo.add(i);
		Fibo.add(j);
		
		for (int a = 0; a <= fa; a++) {
			sum = i + j;
			i = j;
			j = sum;
			
			Fibo.add(sum);
		}
		System.out.println(Fibo);
		
		Scanner num = new Scanner(System.in);
		System.out.println("\nWrite the number (index): ");
		int indexNum = num.nextInt();
		
		int element = Fibo.get(indexNum);
		System.out.println("The element at index " + indexNum + " is " + element);
		
		
//		================================
		
	}

}
