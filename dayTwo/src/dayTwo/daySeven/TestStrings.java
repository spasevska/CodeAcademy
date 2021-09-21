package dayTwo.daySeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestStrings {
	
	static int counter = 0;
	
	
	public static void main(String[] args) {
		List<String> nas = new LinkedList<>();
		List<String> names = new ArrayList<>();
		names.add("mile");
		names.add("dijana");
		names.add("stole");
		names.add("marija");
//		names.forEach(name -> System.out.println(name));
		names.stream()
			.filter(name -> name.startsWith("m"))
			.filter(name -> name.endsWith("e"))
			.map(name -> name.toUpperCase())
			.forEach(name -> System.out.println(name));
		
		List<Integer> numbers = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		Boolean res = numbers
			.stream()
			.filter(number -> { return number.intValue() == 6;})
			.map(number -> Boolean.TRUE)
			.findFirst()
			.orElseGet(() -> Boolean.FALSE);
		boolean res2 = numbers.stream().anyMatch(number -> number.intValue() == 6);
		
		System.out.println(res);
		System.out.println(res2);
	}
	
	public void printCounter() {
		System.out.println(counter);
	}
}
