package dayThirteen;

import java.util.HashMap;
import java.util.Map;

public class TestSimpleDictionary {
	public static void main(String[] args) {
		Map<String, String> translations = new HashMap<>();
		translations.put("apple", "jabolko");
		translations.put("car", "avtomobil");
		translations.put("desk", "masa");
		
		System.out.println(translations.get("car"));
		System.out.println(translations.get("desk"));
		System.out.println(translations.get("black"));
	}
}
