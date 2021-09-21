package dayThirteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestHoliday {
	public static void main(String[] args) {
		Holiday h1 = new Holiday(100, "ohrid", 1);
		Holiday h2 = new Holiday(160, "egipet", 2);
		Holiday h3 = new Holiday(150, "bugarija", 3);
		Holiday h4 = new Holiday(110, "malezija", 4);
		
		List<Holiday> holidayList = new ArrayList<>();
		holidayList.add(h1);
		holidayList.add(h2);
		holidayList.add(h3);
		holidayList.add(h4);
		holidayList.add(h1);
		holidayList.add(h2);
		holidayList.add(h3);
		holidayList.add(h4);
		
		System.out.println("\nour holidays are: ");
		for (Holiday holiday : holidayList) {
			System.out.println(holiday);
		}
		
		Set<Holiday> holidaySet = new HashSet<>();
		for (Holiday holiday : holidayList) {
			holidaySet.add(holiday);
		}
		
		System.out.println("\nout holiday set: ");
		for (Holiday holiday : holidaySet) {
			System.out.println(holiday);
		}
		System.out.println();
		
		Map<Integer, Holiday> holidayMap = new HashMap<>();
		for (Holiday holiday : holidaySet) {
			holidayMap.put(holiday.clientId, holiday);
		}
		System.out.println(holidayMap.get(1));
		System.out.println(holidayMap.get(2));
		System.out.println(holidayMap.get(3));
		System.out.println(holidayMap.get(4));
	}
}
