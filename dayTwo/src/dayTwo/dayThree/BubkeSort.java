package dayTwo.dayThree;

import java.util.ArrayList;
import java.util.List;

public class BubkeSort {

	public static void main(String[] args) {
		int [] firstArray = new int [] {5, 1, 6, 7, 6, 5, 8, 2, 6, 6, 6};
//		printArray(firstArray);
//		int [] result = getSortedArray(firstArray);
//		
//		bubleSort(firstArray);
//		printArray(firstArray);
		System.out.println(findIndexForNumber(firstArray, 6));
		
		System.out.println(getAllIndexFromNumber(firstArray, 6));
		System.out.println(getAllIndexFromNumber(firstArray, 0));
		System.out.println(getAllIndexFromNumber(null, 6));
		System.out.println(getNumberOfOcourencesVariantOne(firstArray, 0));
		System.out.println(getNumberOfOcourencesVariantOne(firstArray, 5));
		System.out.println(getNumberOfOcourencesVariantTwo(firstArray, 5));
		
	}
	
	public static void bubleSort(int[] input) {
		int n = input.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (input[j] > input[j + 1]) {
					int tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
				}
			}
		}
	}
	
	
	public static int findIndexForNumber(int[] input, int number) {
		// proveri za sekoj index od arejto dali vrednosta za daden index  e ednakva na brojot koj go barame, ako e ednakva vrati go indeksot kako rezultat
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	public static List<Integer> getAllIndexFromNumber(int[] input, int number) {
		List<Integer> indexes = new ArrayList<>();
		if (input == null) {
			return indexes;
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] == number) {
				indexes.add(i);
			}
		}
		
		return indexes;
	}
	
	public static int getNumberOfOcourencesVariantOne(int[] input, int number) {
		return getAllIndexFromNumber(input, number).size();
	}
	
	
	public static int getNumberOfOcourencesVariantTwo(int[] input, int number) {
		int counter = 0;
		if (input != null) {
			for (int i = 0; i < input.length; i++) {
				if (input[i] == number) {
					counter++;
				}
			}			
		}
		
		return counter;
	}
	
	
	
	
	public static int [] getSortedArray(int[] inputArray) {
		int [] tmpArray = new int [inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			tmpArray[i] = inputArray[i];
		}
		
		for (int i = 0; i < tmpArray.length; i++) {
			
		}
		
		
		
		return tmpArray;
	}
	
	public static int [] swapValueInArray(int firstPosition, int secondPosition, int[] array) {
		int [] tmpArray = array;
		
		int tmp = tmpArray[firstPosition];
		tmpArray[firstPosition] = tmpArray[secondPosition];
		tmpArray[secondPosition] = tmp;
		
		return tmpArray;
	}
	
	public static void printArray(int [] input) {
		System.out.print("[");
		for (int i : input) {
			System.out.print(i + ", ");
		}
		System.out.println("]");
	}

}
