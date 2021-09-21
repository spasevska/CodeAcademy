package dayNine;

public abstract class Lightbulb {
	int price = 10;
	static int serialNumber;
	public abstract void turnOn();
	public void someMethod() {
		System.out.println("do some method things");
		
	}
	
	public static void someStaticMethod() {
		System.out.println("do some static method things");
	}
}
