package dayThirteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("mile");
		nameList.add("vesna");
		nameList.add("filip");
		nameList.add("mile");


		System.out.println("name List:");
		for (String name : nameList) {
			System.out.println(name);
		}

		Set<String> nameSet = new HashSet<>();
		for (String name : nameList) {
			nameSet.add(name);
		}

		System.out.println("\nnames Set:");
		for (String name : nameSet) {
			System.out.println(name);
		}
		
		System.out.println("\nMap:");
		Map<String, Integer> nameCharMap = new HashMap<>();
		for (String name : nameSet) {
			nameCharMap.put(name, name.length());
		}
		
		System.out.println(nameCharMap.get("filip"));

	}
}
