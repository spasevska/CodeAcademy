package dayTwo.dayFive;

import java.util.Arrays;

import dayTwo.dayFour.TestArray;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] array = TestArray.getNewFullArray(20);
		Arrays.sort(array);
		TestArray.printArrayHorizontally(array);
		System.out.println(existBinarySearch(array, 50));
	}
	
	
	public static boolean existBinarySearch(int[] theArray, int element) {
		int minIndex = 0;
		int maxIndex = theArray.length - 1;
		boolean exist = false;
		while (!exist && minIndex <= maxIndex) {
			int midIndex = (maxIndex - minIndex) / 2; // 0 + 50
			if (element == theArray[midIndex]) {
				return true;
			} else if (element > theArray[midIndex]) {
				minIndex = midIndex;
			} else {
				maxIndex = midIndex;
			}		
		}
		return exist;
	}
}
