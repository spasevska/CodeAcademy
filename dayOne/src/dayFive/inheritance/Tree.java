package dayFive.inheritance;

public class Tree {
	String type = "winter green";
	int height = 100;

	public String grow(int cm) {
		this.height = height + cm;
		return "i have grown " + cm + " centimeters. " + "Now i am: " + height + " cm";
	}

	public Tree() {
		super();
	}
}
