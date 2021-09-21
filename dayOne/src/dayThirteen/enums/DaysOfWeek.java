package dayThirteen.enums;

public enum DaysOfWeek {
	PONEDELNIK("monday", 1), 
	VTORNIK("tyesday", 2), 
	SREDA("wednesday", 3), 
	CETVRTOK("thursday", 4), 
	PETOK("friday", 5), 
	SABOTA("saturday", 6), 
	NEDELA("sunday", 7);
	
	private String englishVerion;
	private int dayOrder;
	public static final int numberDaysOfWeek = 7;

	private DaysOfWeek(String englishVersion, int dayOrder) {
		this.englishVerion = englishVersion;
		this.dayOrder = dayOrder;
	}

	public String getEnglishVerion() {
		return englishVerion;
	}

	public void setEnglishVerion(String englishVerion) {
		this.englishVerion = englishVerion;
	}
	
	public static String getNumberOfDaysAsString() {
		return "7";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[englishVersion: " + englishVerion + ", dayOrder: " + dayOrder + "]";
	}
	
}
