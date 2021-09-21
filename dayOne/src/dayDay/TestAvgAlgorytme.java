package dayDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAvgAlgorytme {

	static int someCounter = 0;
	private static int[] arr;

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(6);
		nums.add(8);
		nums.add(10);
		System.out.println(calculateAverageValue(nums));
		someCounter++;
		System.out.println(calculateAverageValue(nums));
		someCounter++;
		System.out.println(calculateAverageValue(nums));

	}

	public static int stringChar(String str) {
		return str.length();
	}

	public void someAlgorythmOne(List<Integer> numbers) { //O (1)
		for (Integer number : numbers) {
			System.out.println(number);	
		}
	}

	public void someAlgorythmTwo(List<Integer> numbers) { //O (n^2)
		for (Integer number : numbers) {
			System.out.println(number);	
			for (Integer integer : numbers) {
				System.out.println(integer);
			}
		}
	}


	/*
	 * 1. define input as list of integer values
	 * 2. set variable total sum to 0
	 * 3. loop over the list of integer values
	 * 4. add each integer value to the total sum
	 * 5. after the loop devide total sum by the number of elements in the list
	 * 6. return the result as integer
	 */

	public static Integer calculateAverageValue(List<Integer> numbers) {
		int totalSum = 0;
		for (Integer number : numbers) {
			totalSum += number;
		}
		return totalSum / numbers.size() + someCounter;

	}


}

