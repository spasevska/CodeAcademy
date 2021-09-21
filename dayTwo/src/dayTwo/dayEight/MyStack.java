package dayTwo.dayEight;

public class MyStack {
	
	private final int maxSize;
	private final Integer[] stack;
	private int topIndex = -1;
	
	
	public MyStack(int size) {
		this.maxSize = size;
		this.stack = new Integer[maxSize];
	}
	
	public boolean push(int value) {
		if (topIndex + 1 == maxSize) { //if it is full
			return false;
		} else {
			topIndex++;
			stack[topIndex] = value;
			return true;
		}
	}
	
	public int pop() {
		if (topIndex < 0) {
			throw new RuntimeException("Stack is empty");
		} else {
			int tmpValue = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return tmpValue;
		}
	}
	
	public int peek() {
		if (topIndex < 0) {
			throw new RuntimeException("Stack is empty");
		} else {
			return stack[topIndex];
		}
	}
	
	public int size() {
		return topIndex + 1;
	}
	
	public void printStack() {
		int tmpIndex = topIndex;
		while (tmpIndex >= 0) {
			System.out.println("| " + stack[tmpIndex] + " |");
			tmpIndex--;
		}
		System.out.println("---------------------");
	}
	
}
