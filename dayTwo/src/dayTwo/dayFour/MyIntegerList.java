package dayTwo.dayFour;

public class MyIntegerList {
	
	private Integer[] array = new Integer[1];
	private int currentCount = 0;
	
	public int size() {
		return currentCount;
	}
	
	public void addLast(Integer element) {
		extendIfNeeded();
		boolean added = true;
		if (currentCount == array.length) {
			added = false;
		} else {
			array[currentCount] = element;
			currentCount++;	
		}
	}
	
	public void addFirst(Integer element) {
		extendIfNeeded();
		int currentIndex = currentCount;
		while (currentIndex > 0) {
			array[currentIndex] = array[currentIndex - 1];
			currentIndex--;
		}
		currentCount++;
	}
	
	private void  extendIfNeeded() {
		if (array.length == currentCount) {
			Integer[] newArray = new Integer[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			System.out.println("extending size to: " + array.length);
		}
	}
	
	
	public int getByIndex(int index) {
		return array[index];
	}
	
	public Integer removeByIndex(int index) {
		if (index < 0 || index >= currentCount) {
			System.out.println("invalid index value: " + index);
			return null;
		}
		int tmp = array[index];
		while (index < array.length - 1 && array[index + 2] != null) {
			array[index] = array[index + 1];
			index++;
		}
		currentCount--;
		return tmp;
	}
	
	public boolean exists(Integer value) {
		boolean exists = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				exists  = true;
				break;
			}
		}
		return exists;
	}
	
	
//	public void printArrayHorizontally() {
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//	}
	
	private void printArrayHorizontally() {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + " | ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("------");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				break;
			} else {	
				if ( i == array.length - 1 && array[i + 1] == null) {
					s = s + array[i];
				} else {					
					s = s + array[i] + ", ";
				}
			}
		}
		s = s+ "]";
		return s;
	}
	
	
}
