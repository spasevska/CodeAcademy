package dayDay;

public class TestFactoriel {
	public static void main(String[] args) {
		// n! => 5*4!  = ? 5 * 4 * 3 * 2 * 1
//		brokenFaktoriel(5);
		factoriel(3);
		System.out.println(factoriel(2));
		
		
   /*
    * method accepts integer as input value
    * factorial for n is n * factorial (n-1)
    * if n in input argument factorial from 1 is 1
    */
		
	
	}
	
	
	public static int factoriel(int n) {
		if (n == 2) {
			return 2;
		} else {
			return n * factoriel(n-1);
		}
	}
	
	public static int brokenFaktoriel(int n) {
		return brokenFaktoriel(n);
	}
}
