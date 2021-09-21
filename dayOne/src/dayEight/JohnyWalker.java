package dayEight;

public class JohnyWalker extends Wiskey{
	public static int serialNumber = 0;
	public int price;
	
	public JohnyWalker(int price) {
		super();
		this.price = price;
		serialNumber++;
	}

	public int poorGlass(int numberOfShots) {
		return numberOfShots * 50;
	}
	
	@Override
	public String toString() {
		return "jw price: " + price;
	}
	
}
