package Algorythms;

import java.util.ArrayList;
import java.util.List;

public class Prva {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(10);
		nums.add(15);
		System.out.println("The average value is: " + calculateAverage(nums));
		System.out.println("The sum is: " + calculateSum(nums));
		
	}
	
	public static Integer calculateAverage(List<Integer> numbers) { 
		int totalSum = 0;
		for (Integer number : numbers) {
			totalSum += number;
		}
		return totalSum / numbers.size();
	}
	
	public static Integer calculateSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}
	
}
