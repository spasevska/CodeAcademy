package dayTwo.dayFour;

public class TestArray {

	public static void main(String[] args) {
//		int[] array1 = new int[] {6, 3, 4524, 453, 5874, 0};
//		int[] array2 = new int[] {35, 8, 78, 5, 6};
//		int[] array3 = new int[] {4, 8, 6, 45, 85};

		//		printArrayVertically(array1);
		//		System.out.println();
		//		printArrayVertically(array2);
		//		System.out.println();
		//		printArrayVertically(array3);

//		printArrayHorizontally(array1);
		
//		System.out.println((int)(Math.random() * 100));
		int[] newArray = getNewFullArray(10);
		
		printArrayHorizontally(newArray);
		printArrayHorizontally(newArray);
		printArrayHorizontally(newArray);
		
	}

	// Algorythm for printing content of array

	//	public static void printArrayVertically(int[] theArray) {
	//		System.out.println("I | V");
	//		System.out.println("-----------");
	//		for (int i = 0; i < theArray.length; i++) {
	//			System.out.print(i);
	//			System.out.print(" | ");
	//			System.out.println(theArray[i]);
	//			System.out.println("-----------");
	//		}
	//	}

	public static void printArrayHorizontally(int[] theArray) {
		System.out.println();
		for (int i = 0; i < theArray.length; i++) {
			System.out.print(i + " | ");
		}
		System.out.println();
		for (int i = 0; i < theArray.length; i++) {
			System.out.print("------");
		}
		System.out.println();
		for (int i = 0; i < theArray.length; i++) {
			System.out.print(theArray[i] + " | ");
		}
		System.out.println();
	}
	
	public static int findValueForIndex(int[] theArray, int index) {
		return theArray[index];
		
	}
	
	public static int findSizeOfArray(int[] theArray) {
		return theArray.length;
	}
	
	public static int findIndexForValue(int[] theArray, int value) {
		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static boolean doesValueExist(int[] theArray, int value) {
		boolean exist = false;
		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				exist = true;
				break;
			}
		}
		return exist;
	}
	
	public static int[] getNewEmptyArray(int size) {
		return new int[size];
	}
	
	public static int[] getNewFullArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = getRandomNumber();
		}
		return newArray;
	}
	
	public static int getRandomNumber() {
		return (int)(Math.random() * 100);
	}
	
	
}
