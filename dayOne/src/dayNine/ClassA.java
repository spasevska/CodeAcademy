package dayNine;

public class ClassA {

	private String color;
	private int price;

	private ClassA(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public static ClassA newInstance() {
		return new ClassA("white", 100);
	}
	
	public static ClassA newInstance(String color, int price) {
		return new ClassA(color, price);
	}
	
}
