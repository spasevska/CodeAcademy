package daySeven;

public class Appel {
	
	private static int numberOfApples = 0;

	private String type = "Muco";

	public String getType() {
		return this.type;
	}
	
	public static int getnumberOfApples() {
		return Appel.numberOfApples;
	}
}
