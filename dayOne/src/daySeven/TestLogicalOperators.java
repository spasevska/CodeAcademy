package daySeven;

public class TestLogicalOperators {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		
//		if ( c > a & c > b & c > 100) {
//			System.out.println("c is the biggest number");
//		} else {
//			System.out.println("false");
//		}
//		
//		
//		if ( b < a || b < c) {
//			System.out.println("b is not the biggest number");
//		}
		
		String name = a < b ? "pero" : "zdero";
		if (a < b) {
			name = "pero";
		} else {
			name = "zdero";
		}
		
		
		a = b = c = 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a++);
		System.out.println(--a);
		
	}
}
