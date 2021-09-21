package dayNine;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("a name");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names.size());
		
	}
	
	public void outOfMain() {
		List<String> names = new ArrayList<>();
		names.add("a name");
	}
}
