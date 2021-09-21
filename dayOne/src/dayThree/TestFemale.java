package dayThree;

public class TestFemale {
	
	public static void main(String[] args) {
//		Female f1;
//		new Female();
//		f1 = new Female();
//		Female f2 = f1;
		
//		Male m1 = new Male();
//		System.out.println(m1);
//		m1 = new Male();
		
//		Female f1 = new Male();
		
		String coe = new String("brown");
		int height = 169;
		Female f3 = new Female(coe, height, "Magdalena");
		
		String str1 = f3.drive();
		System.out.println(str1);
		Female f4 = f3.createNewFemaleObject("gree");
			
	}

}
