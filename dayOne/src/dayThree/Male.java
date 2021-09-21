package dayThree;

public class Male {
	String colorOfEyes, n;
	int height;
	
	public Male(String colorOfEyes, int height, String name) {
		this.colorOfEyes = name + "has color of eyes: " + colorOfEyes;
		this.height = height;
		colorOfEyes = "green";
//		name = "Damjan";
		this.n = name;
		
	}
	
	public String name() {
		return this.n + " is the name";
	}
	
	public int h1() {
		return this.height;
	}
}
