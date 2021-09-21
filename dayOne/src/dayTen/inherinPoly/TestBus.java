package dayTen.inherinPoly;

import java.util.ArrayList;
import java.util.List;

public class TestBus {
	public static void main(String[] args) {
//		SchoolBus sb = new SchoolBus();
//		sb.drive(150);
		
		List<Bus> busses = new ArrayList<>();
		busses.add(new Bus());
		busses.add(new SchoolBus());
		driveAllBusses(busses);
		
		Object o = new SchoolBus();
		System.out.println(o);
		
		Bus b2 = new SSSB();
		Object o2 = b2;
		System.out.println(o2);
		System.out.println(b2);
		
	}

	private static void driveAllBusses(List<Bus> busses) {
		for (Bus bus : busses) {
			bus.drive(200);
		}
		
	}
}
