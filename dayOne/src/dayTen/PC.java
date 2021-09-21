package dayTen;

public class PC {
	private int price;
	private String type;
	private boolean isDesktop;
	
	
	public PC(int price, String type, boolean isDesktop) {
		super();
		this.price = price;
		this.type = type;
		this.isDesktop = isDesktop;
	}


	@Override
	public String toString() {
		return "PC [price=" + price + ", type=" + type + ", isDesktop=" + isDesktop + "]";
	}
	
	

}
