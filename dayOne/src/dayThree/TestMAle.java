package dayThree;

public class TestMAle {
	
	public static void main(String[] args) {
		String proba = new String("proba");
		int height = 200;
		String name = "Damjan";
		Male m1 = new Male(proba, height, name);
		
		String mm1 = m1.name();
		System.out.println(mm1);
		
		Male m2 = new Male(proba, height, name);
		int mm2 = m2.h1();
		System.out.println(name + " is height " + mm2 + "cm");
		
	}
}
