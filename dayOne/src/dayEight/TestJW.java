package dayEight;

public class TestJW {

	public static void main(String[] args) {
		System.out.println(JohnyWalker.serialNumber);
		JohnyWalker jw1 = new JohnyWalker(120);
//		String jw1s = jw1.toString();
//		System.out.println(jw1s);
//		int ml = jw1.poorGlass(3);
//		System.out.println(ml);
		
		System.out.println(JohnyWalker.serialNumber);
		
		JohnyWalker jw2 = new JohnyWalker(240);
		System.out.println(JohnyWalker.serialNumber);
		
		System.out.println(jw1);
		System.out.println(jw2);

	}

}
