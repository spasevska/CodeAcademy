package dayEleven.box;

import java.io.Serializable;
import java.util.List;

public class Box<T, T2, T3 extends Number & Serializable> {

	private T value1;
	private T2 value2;
	private T3 value3;

	public Box(T value) {
		this.value1 = value;
	}

	public T getValue() {
		return value1;
	}

	public void setValue(T value) {
		this.value1 = value;
	}

	public<J extends Integer> void printBox(J j) {
		String tmp = value1.toString() + j.toString();
	}

	public void playWithList(List<? extends Number> l1) {

	}

	public void playWithList2(List<? super Number> l1) {

	}

}
