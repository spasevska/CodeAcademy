package dayTen;

public class Car {
	
	private String type;
	private int price;
	private String ownerName;
	
	public Car() {
		
	}

	public Car(String type, int price, String ownerName) {
		super();
		this.type = type;
		this.price = price;
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public Car setType(String type) {
		this.type = type;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public Car setPrice(int price) {
		this.price = price;
		return this;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public Car setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		return this;
	}
	
}
