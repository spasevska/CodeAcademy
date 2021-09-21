package dayScanner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class TestMath {
	public static void main(String[] args) {
		math();
	}

	public static void math() {

		Scanner scan = new Scanner(System.in);
		Integer a = 0;

		List<Integer> numbers = new ArrayList<>();

		while (true) {
			System.out.println("Enter integer number or if you want to exit, please enter exit: ");

			String line = scan.nextLine().trim();

			if (line.equalsIgnoreCase("exit")) {
				break;
			}

		}
		

	}
	
	public static Integer collection (Collection<Integer> numbers) {
		
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
		
	}
	
	public static Integer subtraction(Collection<Integer> numbers) {
		int sub = 0;
		for (Integer number : numbers) {
			sub -= number;
		}
		return sub;
	}
	
	
	public static Integer multiplication(Collection<Integer> numbers) {
		int multi = 0;
		for (Integer number : numbers) {
			multi *= number;
		}
		return multi;
	}
	
	
	public static Integer division(Collection<Integer> numbers) {
		int div = 0;
		for (Integer number : numbers) {
			div /= number;
		}
		return div;
	}


}
