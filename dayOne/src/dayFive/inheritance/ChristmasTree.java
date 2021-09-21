package dayFive.inheritance;

public class ChristmasTree extends Tree {
	boolean isDecorated = false;

	public ChristmasTree(boolean isDecorated) {
		super();
		this.height = 55;
		this.isDecorated = isDecorated;
	}
	
	public String grow(int cm) {
		this.height = height + (2 * cm);
		return "i have grown " + (2 * cm) + " centimeters. " + "Now i am: " + height + " cm";
	}
	
//	@Override
//	public String grow(int cm) {
//		// TODO Auto-generated method stub
//		return super.grow(cm);
//	}
	
	@Override
	public String toString() {
		return "I am a christmas tree";
	}

}
