package dayTwelve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import dayEleven.homework.CurvedDisplay;

public class TestList {

	public static void main(String[] args) {
		
		List names = new ArrayList();
		names.add("stojanche");
		names.add("viktor");
		names.add(new CurvedDisplay());
		names.add("stojanche");
		names.add("viktor");
		names.add(new Boolean(true));
		names.add(new CurvedDisplay());
		
		List<Object> objectNames = new ArrayList<>();
		List<String> test = new LinkedList<>();
		
		ArrayList<Object> arrNames = new ArrayList<>();
		
		
		

		for (Object name : names) {
			if (name instanceof String) {
				String shortName = (String)name;
				System.out.println("the short name is: " + shortName);
			}
		}
		
		
		List<String> stringNames = new ArrayList<>();
		
		

	}

}
