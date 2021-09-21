package dayTwo.dayTwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MathCalculator {
	public static void main(String[] args) {
		calculator();
	}
	
	public static void calculator() {
		Collection<Integer> numbers = getNumbersFromUser();
		int operation = getOperationFromUser();
		int result = calculationOperation(numbers, operation);
		System.out.println("the result is: " + result);
		
	}
	
	private static int calculationOperation(Collection<Integer> numbers, int operation) {
		if (operation == 1) {
			return calculateSum(numbers);
		} else if (operation == 2) {
			return calculateAvg(numbers);
		} else if (operation == 3) {
			return getMax(numbers);
		} else if (operation == 4) {
			return getMin(numbers);
		} else if (operation == 5) {
			return calculateMultiplication(numbers);
		}
		return 0;
	}
	
	public static int getOperationFromUser() {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter 1 for sum, 2 for averige, 3 for max number, 4 for min number, 5 for multiplication");
		
		String userChoise = user.nextLine();
		
		Integer operation = 0;
		try {
			operation = Integer.parseInt(userChoise);
		} catch (Exception e) {
			System.out.println("Enter an integer number");
		}
		return operation;
	}
	
	public static Collection<Integer> getNumbersFromUser() {
		Scanner scanner = new Scanner(System.in);
		Integer a = 0;
		
		List<Integer> numbers = new ArrayList<>();
		
		while (true) {
			System.out.println("type exit to finish of integer number a: ");
			String line = scanner.nextLine().trim();
			
			if (line.equalsIgnoreCase("exit")) {
				break;
			}
			try {
				a = Integer.parseInt(line);
				numbers.add(a);
			} catch (Exception e) {
				System.out.println(line + " is not a valid integer number");
				System.out.println("please try again or type exit to close");
			}
		}
		
		scanner.close();
		return numbers;
	}
	
	
	public static Integer calculateSum(Collection<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static Integer calculateAvg(Collection<Integer> numbers) {
		return calculateSum(numbers) / numbers.size();
	}
	
	public static Integer getMax(Collection<Integer> numbers) {
		int maxElement = ((List<Integer>) numbers).get(0);
		for (Integer max : numbers) {
			if (max > maxElement) {
				maxElement = max;
			}
		}
		return maxElement;
	}
	
	public static Integer getMin(Collection<Integer> numbers) {
		int minElement = ((List<Integer>) numbers).get(0);
		for (Integer min : numbers) {
			if (min < minElement) {
				minElement = min;
			}
		}
		return minElement;
	}
	
	public static Integer calculateMultiplication(Collection<Integer> numbers) {
		int multiply = 1;
		for (Integer number : numbers) {
			multiply *= number;
		}
		return multiply;
	}
	
	
}
