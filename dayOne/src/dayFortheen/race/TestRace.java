package dayFortheen.race;

public class TestRace {
	public static void main(String[] args) {
		RaceCar rc1 = new RaceCar(200);
		
		RaceThread rt1 = new RaceThread(rc1);
		RaceThread rt2 = new RaceThread(rc1);
		rt1.start();
		rt2.start();
		
		synchronized (rc1) {
			synchronized (rt1) {
				synchronized (RaceCar.class) {
					System.out.println("i have the key of rc1");
				}			
			}		
		}
				
	}
}
