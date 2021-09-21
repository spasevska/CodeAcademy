package Car;

public class CarS {
	String color;
	static int objectCounter = 0;
	
	public CarS(String color) {
		super();
		objectCounter++;
		this.color = color;
	}

}
