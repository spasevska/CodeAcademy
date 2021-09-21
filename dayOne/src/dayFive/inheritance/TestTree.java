package dayFive.inheritance;

public class TestTree {

	public static void main(String[] args) {
		ChristmasTree ct = new ChristmasTree(true);
		String s = ct.grow(5);
		System.out.println(s);
//		s = ct.grow(5);
//		System.out.println(s);
//		System.out.println(ct.height);

	}

}
