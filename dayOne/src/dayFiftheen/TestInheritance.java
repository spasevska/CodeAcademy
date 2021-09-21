package dayFiftheen;

import java.io.Serializable;
import java.util.List;

public class TestInheritance {
	public static void main(String[] args) {
		Object o1 = new String("hello");
		Serializable s1 = new String("hello");
		CharSequence c1 = new String("bue bue");	
	}
	
	public static void printObjectsToConsole(List<Object> objects) {
		for (Object object : objects) {
			System.out.println(object.toString());
		}
	}
}
