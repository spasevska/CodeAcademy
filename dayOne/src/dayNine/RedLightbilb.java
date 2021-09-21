package dayNine;

public class RedLightbilb extends Lightbulb{

	@Override
	public void turnOn() {
		System.out.println("i am on - red");
	}
	
	public static void drive(String driver) {
		System.out.println(driver + "is driving");
	}

}
