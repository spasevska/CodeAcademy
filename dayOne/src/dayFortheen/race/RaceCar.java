package dayFortheen.race;

public class RaceCar {
	public int speed;

	public RaceCar(int speed) {
		// TODO Auto-generated constructor stub
	}

	public synchronized int getSpeed() {
		return speed;
	}

	public synchronized int setSpeed(int speed) {
		this.speed = speed;
		return this.speed;
	}

	@Override
	public synchronized String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public synchronized static String getSomeString() {
		return "some string";
	}

}
