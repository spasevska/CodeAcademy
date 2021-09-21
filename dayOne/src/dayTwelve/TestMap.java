package dayTwelve;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		
		Map<String, String> nameSurename = new HashMap<>();
		nameSurename.put("nikola", "gruevski");
		nameSurename.put("abdi", "bajram");
		
		System.out.println(nameSurename.get("abdi"));
		System.out.println(nameSurename.get("petar"));
		
		System.out.println(nameSurename);
		nameSurename.remove("nikola");
		System.out.println(nameSurename);
		
		Map<Long, Citizen> citizensOfSkopje = new HashMap<>();
	}
}
