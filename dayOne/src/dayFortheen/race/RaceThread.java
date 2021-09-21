package dayFortheen.race;

public class RaceThread extends Thread {
	
	private RaceCar rc1;

	public RaceThread(RaceCar rc1) {
		this.rc1 = rc1;
	}

	@Override
	public void run() {
		System.out.println(rc1.getSpeed());
		System.out.println(rc1.setSpeed(500));
	}
}
