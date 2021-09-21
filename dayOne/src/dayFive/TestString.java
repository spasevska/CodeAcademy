package dayFive;

public class TestString {

	public static void main(String[] args) {
		String s1 = "one";
		String s2 = new String("one");
		String s3 = "one";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		
		String s4 = s3.concat(" two");
		System.out.println("s4: " + s4);
		System.out.println("s3: " + s3);
		
		String s5 = s4.substring(0, 2);
		System.out.println(s5);		
		String s6 = s4.substring(0, 5);
		System.out.println(s6);
		

	}

}
