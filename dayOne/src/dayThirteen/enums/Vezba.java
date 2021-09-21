package dayThirteen.enums;

public class Vezba {
	public enum Seasion {
		WINTER,
		SPRING,
		SUMMER,
		FALL;
	}
	
	public static void main(String[] args) {
		for (Seasion s : Seasion.values()) {
			System.out.println(s);
		}
		
		System.out.println("Value of WINTER is: " + Seasion.valueOf("WINTER"));
		System.out.println("Index of WINTER is: " + Seasion.valueOf("WINTER").ordinal());
		System.out.println("Index of SUMMER is: " + Seasion.valueOf("SUMMER").ordinal());
	}
}
