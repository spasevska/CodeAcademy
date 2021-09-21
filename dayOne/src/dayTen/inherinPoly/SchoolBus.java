package dayTen.inherinPoly;

public class SchoolBus extends Bus {

	String color = "black";
	
	
	
	@Override
	public void drive(int speed) {
		if (speed > 80) {
			System.out.println();
			System.out.println("you are not allow to go that fast");
			System.out.println("Speed limited to 80");
			System.out.println("i am driving with 80mph");
		} else {
//			super.drive(speed);
			System.out.println("driving with speed: " + speed);
		}
	}
	
	@Override
	public String toString() {
		return "School";
	}
}
