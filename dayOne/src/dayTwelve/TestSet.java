package dayTwelve;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("ana");
		hashSet.add("petar");
		hashSet.add("ile");
		
		for (String string : hashSet) {
			System.out.println("proba: " + string);
		}

	}

}
