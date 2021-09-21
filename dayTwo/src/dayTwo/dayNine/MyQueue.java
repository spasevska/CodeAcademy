package dayTwo.dayNine;

public class MyQueue {
	private Integer[] values;
	private int size = 0;

	public MyQueue(int values) {
		super();
		this.values = new Integer[values];
	}
	
	public boolean enqueue(int value) {
		if (size < values.length) {
			shiftRight();
			values[0] = value;
			size++;
			return true;
		} else {
			return false;			
		}
	}
	
	private void shiftRight() {
		for (int i = values.length - 1; i > 0; i--) {
			values[i] = values[i - 1];
		}
		
	}

	public int dequeue() {
		if (size == 0) {
			throw new IllegalStateException();
		}
		int tmp = values[size - 1];
		values[size - 1] = null;
		size--;
		return tmp;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < values.length; i++) {
			s += values[i] == null ? "" : values[i] + ", ";
		}
		s += "]";
		return s;
	}
}
