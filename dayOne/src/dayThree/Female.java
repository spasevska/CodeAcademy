package dayThree;

public class Female {
	String colorOfEyes;
	String n;
	int height;
//	Integer i2 = 22;
	
	Female(String colorOfEyes, int height, String name) {
		this.colorOfEyes = name + " has color of eyes: " + colorOfEyes;
		this.height = height;
		colorOfEyes = "blue";
		this.n = name;
//		return this;
	}
	
	public String drive() {
		return this.n + " is driving";
	}
	
	public void sing() {
		System.out.println(" a female with hight: " + height + " is singing");
		
	}
	
	public Female createNewFemaleObject(String color) {
		Female f1 = new Female(null, 0, null);
		f1.colorOfEyes = color;
		return f1;
	}
}
