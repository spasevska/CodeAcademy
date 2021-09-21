package dayScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEstCalc {
	public static void main(String[] args) {
		theCalculator();	
		
	}
	
	public static void theCalculator() {
		
		Scanner scan = new Scanner(System.in);
		Integer a = 0;
		
		List<Integer> numbers = new ArrayList<>();
		
		while (true) {
			System.out.println("Enter integer number or if you want to exit, please type exit: ");
			String line = scan.nextLine().trim();
			if (line.equalsIgnoreCase("exit")) {
				break;
			}
			
			try {
				a = Integer.parseInt(line);
				numbers.add(a);
				
			} catch (Exception e) {
				System.out.println(line + " is not a valid integer number");
				System.err.println("please try again or type exit to close");
			}
		}
		
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		System.out.println("the total sum of all numbers is: " + sum);
		scan.close();
	}
}
